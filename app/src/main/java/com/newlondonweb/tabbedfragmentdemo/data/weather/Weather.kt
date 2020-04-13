package com.newlondonweb.tabbedfragmentdemo.data.weather

data class Weather(
    val lat:Double,  /*Geographical coordinates of the location (latitude)*/
    val lon:Double, /* Geographical coordinates of the location (longitude)*/
    val timezone:String,/* Timezone name for the requested location*/
    val current:Current,
    val hourly: ArrayList<Current>,
    val daily: ArrayList<Daily>
)

data class Current(
/*current Current weather data API response*/
    val dt: Int, /* Current time, unix, UTC*/
    val sunrise: Int, /* Sunrise time, unix, UTC*/
    val sunset: Int, /* Sunset time, unix, UTC*/
    val temp:Double, /* Temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit. How to change units format*/
    val feels_like:Double, /* Temperature. This temperature parameter accounts for the human perception of weather. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.*/
    val pressure: Int, /*  Atmospheric pressure on the sea level, hPa*/
    val humidity: Int,/* Humidity, %*/
    val dew_point: Double, /* Atmospheric temperature (varying according to pressure and humidity) below which water droplets begin to condense and dew can form. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.*/
    val clouds: Int, /* Cloudiness, %*/
    val uvi: Double, /* UV index*/
    val visibility: Int, /* Average visibility, meters*/
    val wind_speed: Double, /* Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour. How to change units format*/
    val wind_gust: Double, /* Wind gust. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour. How to change units format*/
    val wind_deg:Int, /* Wind direction, degrees (meteorological)*/
    val rain: Map<String,Double>, /* Precipitation volume, mm*/
    val snow: Map<String,Double>, /* Snow volume, mm*/
    val weather:ArrayList<MWeather> /* (more info Weather condition codes)*/
)



data class MWeather (
    val id:String, /* Weather condition id*/
    val main:String, /* Group of weather parameters (Rain, Snow, Extreme etc.)*/
    val description:String, /* Weather condition within the group (full list of weather conditions). Get the output in your language*/
    val icon:String /* Weather icon id. How to get icons*/
)

data class Daily(
/*current Current weather data API response*/
    val dt: Int, /* Current time, unix, UTC*/
    val sunrise: Int, /* Sunrise time, unix, UTC*/
    val sunset: Int, /* Sunset time, unix, UTC*/
    val temp:Temperature, /* Temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit. How to change units format*/
    val feels_like:Temperature, /* Temperature. This temperature parameter accounts for the human perception of weather. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.*/
    val pressure: Int, /*  Atmospheric pressure on the sea level, hPa*/
    val humidity: Int,/* Humidity, %*/
    val dew_point: Double, /* Atmospheric temperature (varying according to pressure and humidity) below which water droplets begin to condense and dew can form. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.*/
    val clouds: Int, /* Cloudiness, %*/
    val uvi: Double, /* UV index*/
    val visibility: Int, /* Average visibility, meters*/
    val wind_speed: Double, /* Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour. How to change units format*/
    val wind_gust: Double, /* Wind gust. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour. How to change units format*/
    val wind_deg:Int, /* Wind direction, degrees (meteorological)*/
    val rain: String, /* Precipitation volume, mm*/
    val snow: String, /* Snow volume, mm*/
    val weather:ArrayList<MWeather> /* (more info Weather condition codes)*/
)

data class Temperature (
    val day:Double,
    val min:Double,
    val max:Double,
    val night:Double,
    val eve:Double,
    val morn:Double
)