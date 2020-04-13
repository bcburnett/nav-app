package com.newlondonweb.tabbedfragmentdemo.ui.main.fragments

import android.content.Context
import android.content.Intent
import android.location.Geocoder
import android.location.Location
import android.net.ConnectivityManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.gson.Gson
import com.newlondonweb.tabbedfragmentdemo.R
import com.newlondonweb.tabbedfragmentdemo.R.layout.fragment_weather
import com.newlondonweb.tabbedfragmentdemo.data.weather.Weather
import com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters.WeatherAdapter
import kotlinx.android.synthetic.main.fragment_weather.*
import java.util.*


/**
 * A simple [Fragment] subclass.
 */
class WeatherFragment : Fragment() {

    companion object {
        @Volatile
        private var INSTANCE: WeatherFragment? = null
        fun getInstance(): WeatherFragment {
            if(INSTANCE == null) INSTANCE=WeatherFragment()
            return INSTANCE as WeatherFragment
        }
    }
    private val va = WeatherAdapter(frag = this)
    private val connectivityManager =
        this.parentFragment?.activity?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?

    private val fusedLocationClient: FusedLocationProviderClient by lazy {
        LocationServices.getFusedLocationProviderClient(this.requireActivity())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) =
        inflater.inflate(fragment_weather, container, false)!!

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val recyclerView = rv_Weather

        recyclerView.layoutManager = GridLayoutManager(this.context, 1)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = va
        tv_Forcast.setOnClickListener { getWeather() }
        getWeather()
    }

    private fun callDarkSky() = fusedLocationClient.lastLocation.addOnSuccessListener {
        it ?: return@addOnSuccessListener
        Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://darksky.net/forecast/${it.latitude}%2C${it.longitude}/us12")
        ).also { startActivity(it) }
    }

    override fun onResume() = super.onResume().also { getWeather() }

    private fun getWeather() = fusedLocationClient.lastLocation
        .addOnSuccessListener { location: Location? ->
            location ?: return@addOnSuccessListener
            doHttpRequestForWeather(location)
        }

    private fun doHttpRequestForWeather(location: Location) {
        Volley.newRequestQueue(this.context).also { requestQueue ->
            requestQueue.add(
                JsonObjectRequest(
                    Request.Method.GET,
                    "https://api.openweathermap.org/data/2.5/onecall?lat=${location.latitude}&lon=${location.longitude}&units=imperial&appid=2e47deaedc70f784b3aabcab50a2e950",
                    null,
                    {
                        doDisplay(
                            Gson().fromJson(it.toString(), Weather::class.java),
                            location
                        )
                    },
                    { Log.d("TAG", it.toString()) })
            )
            requestQueue.start()
        }


    }


    private fun doDisplay(json: Weather, location: Location) {
        Log.d("marker", json.hourly.toString())
        val unixSeconds: Long = json.current.dt.toLong()
        val date = Date(unixSeconds * 1000L)
        val sdfDate = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss z", Locale.US)
            .apply { timeZone = TimeZone.getDefault() }
//
        tv_Date.text = sdfDate.format(date)
        tv_City.text = try {
            Geocoder(this.context, Locale.US).getFromLocation(
                location.latitude,
                location.longitude,
                1
            )[0].locality
        } catch (e: Throwable) {
            "Default"
        }
        tv_Temp.text = "Current Temperature: ${json.current.temp.toString()}"
        tv_Forcast.text = " Current Weather Conditions: ${json.current.weather[0].main} ${json.current.weather[0].description}"
        va.setHours(json.hourly)
    }
}
