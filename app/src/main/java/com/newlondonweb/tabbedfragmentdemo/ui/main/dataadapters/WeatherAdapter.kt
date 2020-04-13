package com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.newlondonweb.tabbedfragmentdemo.R
import com.newlondonweb.tabbedfragmentdemo.data.weather.Current
import com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.WeatherFragment
import kotlinx.android.synthetic.main.weather_item.view.*
import java.util.*
import kotlin.collections.ArrayList

class WeatherAdapter(
    private val frag: WeatherFragment,
    private var hours: ArrayList<Current> = arrayListOf()
) :
    RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>() {

    inner class WeatherViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val hourTime = itemView.wi_time
        val temperature = itemView.wi_temp
        val feelsLike = itemView.wi_feelsLike
        val humidity = itemView.wi_humidity
        val cloud = itemView.wi_cloud
        val wind = itemView.wi_wind
        val forecast = itemView.wi_forecast

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        WeatherViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(
                    R.layout.weather_item,
                    parent,
                    false
                )
        )

    override fun getItemCount() = hours.size

    fun setHours(hours: List<Current>) {
        this.hours.clear()
        hours.forEach { this.hours.add(it) }
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: WeatherAdapter.WeatherViewHolder, position: Int) {

        val currentHour = hours[position]
        val unixSeconds: Long = currentHour.dt.toLong()
        val date = Date(unixSeconds * 1000L)
        val sdfDate = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss z", Locale.US)
            .apply { timeZone = TimeZone.getDefault() }
        holder.hourTime.text = sdfDate.format(date)
        holder.temperature.text = "Temp: "+currentHour.temp.toString()
        holder.humidity.text = "Humidity: "+currentHour.humidity.toString()
        holder.feelsLike.text = "Feels Like: "+currentHour.feels_like.toString()
        holder.cloud.text = "Cloud Cover: "+currentHour.clouds.toString()
        holder.wind.text = "Wing Speed: "+currentHour.wind_speed.toString()
        holder.forecast.text = "Forecast: ${currentHour.weather[0].main} ${currentHour.weather[0].description}"
    }
}
