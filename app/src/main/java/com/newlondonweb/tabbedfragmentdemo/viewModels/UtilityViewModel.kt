package com.newlondonweb.tabbedfragmentdemo.viewModels

import android.Manifest
import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.content.Context.LOCATION_SERVICE
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.github.windsekirun.kalmankt.model.LocationKt
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.newlondonweb.tabbedfragmentdemo.R
import com.newlondonweb.tabbedfragmentdemo.data.KalmanProcessor

class UtilityViewModel(application: Application) : AndroidViewModel(application) {


    private val track: ArrayList<Location> by lazy { arrayListOf<Location>() }

    internal val locations: LiveData<List<Location>>
        get() = myLocations

    private val myLocations = MutableLiveData<List<Location>>()

    val locationManager = this.getApplication<Application>()
        .getSystemService(Context.LOCATION_SERVICE) as LocationManager

    val mainHandler = Handler(Looper.getMainLooper())

    val updateScreen = object : Runnable {
        override fun run() {
            if (ActivityCompat.checkSelfPermission(
                    application,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    application,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) return

            locationManager.requestLocationUpdates(
                LocationManager.GPS_PROVIDER,
                5000L,
                6f,
                locationListener
            )

            mainHandler.postDelayed(this, 10000L)
        }

        private val locationListener: LocationListener = object : LocationListener {
            override fun onStatusChanged(p0: String?, p1: Int, p2: Bundle?) {}
            override fun onProviderEnabled(p0: String?) {}
            override fun onProviderDisabled(p0: String?) {}
            override fun onLocationChanged(location: Location) {
                track.add(location)
                myLocations.value = track.takeLast(10)
                track.clear()
                track.addAll(myLocations.value!!)
                Log.d("markerlist", location.toString())
            }
        }
    }


}