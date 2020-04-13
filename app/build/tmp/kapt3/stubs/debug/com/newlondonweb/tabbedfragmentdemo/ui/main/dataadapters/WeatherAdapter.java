package com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0014\u0010\u0014\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/ui/main/dataadapters/WeatherAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/newlondonweb/tabbedfragmentdemo/ui/main/dataadapters/WeatherAdapter$WeatherViewHolder;", "frag", "Lcom/newlondonweb/tabbedfragmentdemo/ui/main/fragments/WeatherFragment;", "hours", "Ljava/util/ArrayList;", "Lcom/newlondonweb/tabbedfragmentdemo/data/weather/Current;", "Lkotlin/collections/ArrayList;", "(Lcom/newlondonweb/tabbedfragmentdemo/ui/main/fragments/WeatherFragment;Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setHours", "", "WeatherViewHolder", "app_debug"})
public final class WeatherAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters.WeatherAdapter.WeatherViewHolder> {
    private final com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.WeatherFragment frag = null;
    private java.util.ArrayList<com.newlondonweb.tabbedfragmentdemo.data.weather.Current> hours;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters.WeatherAdapter.WeatherViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setHours(@org.jetbrains.annotations.NotNull()
    java.util.List<com.newlondonweb.tabbedfragmentdemo.data.weather.Current> hours) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.ui.main.dataadapters.WeatherAdapter.WeatherViewHolder holder, int position) {
    }
    
    public WeatherAdapter(@org.jetbrains.annotations.NotNull()
    com.newlondonweb.tabbedfragmentdemo.ui.main.fragments.WeatherFragment frag, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.newlondonweb.tabbedfragmentdemo.data.weather.Current> hours) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0019\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/ui/main/dataadapters/WeatherAdapter$WeatherViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/newlondonweb/tabbedfragmentdemo/ui/main/dataadapters/WeatherAdapter;Landroid/view/View;)V", "cloud", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getCloud", "()Landroid/widget/TextView;", "feelsLike", "getFeelsLike", "forecast", "getForecast", "hourTime", "getHourTime", "humidity", "getHumidity", "temperature", "getTemperature", "wind", "getWind", "app_debug"})
    public final class WeatherViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView hourTime = null;
        private final android.widget.TextView temperature = null;
        private final android.widget.TextView feelsLike = null;
        private final android.widget.TextView humidity = null;
        private final android.widget.TextView cloud = null;
        private final android.widget.TextView wind = null;
        private final android.widget.TextView forecast = null;
        
        public final android.widget.TextView getHourTime() {
            return null;
        }
        
        public final android.widget.TextView getTemperature() {
            return null;
        }
        
        public final android.widget.TextView getFeelsLike() {
            return null;
        }
        
        public final android.widget.TextView getHumidity() {
            return null;
        }
        
        public final android.widget.TextView getCloud() {
            return null;
        }
        
        public final android.widget.TextView getWind() {
            return null;
        }
        
        public final android.widget.TextView getForecast() {
            return null;
        }
        
        public WeatherViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}