package com.newlondonweb.tabbedfragmentdemo.viewModels

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.content.Context.LOCATION_SERVICE
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.core.content.ContextCompat.getSystemService
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.github.windsekirun.kalmankt.model.LocationKt
import com.newlondonweb.tabbedfragmentdemo.data.KalmanProcessor

class UtilityViewModel(application: Application) : AndroidViewModel(application)  {

lateinit var locationManager: LocationManager
    lateinit var mainHandler: Handler
    private val kalmanProcessor = KalmanProcessor()
    private val track:ArrayList<Location> by lazy { arrayListOf<Location>() }

    internal val locations: LiveData<List<LocationKt>>
        get() = myLocations
    private val myLocations = MutableLiveData<List<LocationKt>>()

    private val myloc = arrayListOf(
        LocationKt()
            .apply {
                setLatitude(0.0)
                setLongitude(0.0)})



    fun setup() {
        kalmanProcessor.setLocationCallback(1000L){ locationKt -> processLocation(locationKt) }
        locationManager = this.getApplication<Application>().getSystemService(Context.LOCATION_SERVICE) as LocationManager
        mainHandler = Handler(Looper.getMainLooper())
    }

    fun processLocation(locationKt: LocationKt) {
        if (myloc.last().getLatitude() != locationKt.getLatitude() || myloc.last().getLongitude() != locationKt.getLongitude()) {
            myloc.add(locationKt)
            myLocations.value=myloc.takeLast(10)}
        myloc.forEach {
            Log.d("markerlist", " " + it.getLatitude() + " " + it.getLongitude())
        }
        Log.d("markerlist", " "+myloc.last().getLatitude() + " " +myloc.last().getLongitude() )
    }

    val updateScreen = object : Runnable {

        @SuppressLint("MissingPermission")
        override fun run() {

            locationManager.requestLocationUpdates(
                LocationManager.GPS_PROVIDER,
                100L,
                0f,
                locationListener
            )
            mainHandler.postDelayed(this, 1000L)
        }

        private val locationListener: LocationListener = object : LocationListener {
            override fun onStatusChanged(p0: String?, p1: Int, p2: Bundle?) {}
            override fun onProviderEnabled(p0: String?) {}
            override fun onProviderDisabled(p0: String?) {}
            override fun onLocationChanged(location: Location) {
                track.add(location)

                kalmanProcessor.process(avgLocs(track))
                Log.d("markerlist", location.toString())
            }
        }
    }

    fun avgLocs(list: ArrayList<Location>) : Location{
        var lat = 0.0
        var lon = 0.0
        for(l in list){
            lat += l.latitude
            lon += l.longitude
        }
        lat /= list.size
        lon /= list.size
        val loc = list.last()
        loc.latitude = lat
        loc.longitude = lon
        return loc
    }
}