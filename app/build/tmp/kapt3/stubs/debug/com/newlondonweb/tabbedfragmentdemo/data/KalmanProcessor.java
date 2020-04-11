package com.newlondonweb.tabbedfragmentdemo.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\fJ\b\u0010\u001b\u001a\u00020\u0010H\u0002J\u001a\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eJ\"\u0010 \u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/data/KalmanProcessor;", "", "()V", "altitudeTracker", "Lcom/github/windsekirun/kalmankt/filter/KalmanFilter;", "geoHashFilter", "Lcom/github/windsekirun/kalmankt/filter/GeoHashFilter;", "handler", "Landroid/os/Handler;", "initialized", "", "lastLocation", "Lcom/github/windsekirun/kalmankt/model/LocationKt;", "latitudeTracker", "locationCallback", "Lkotlin/Function1;", "", "longitudeTracker", "predicated", "refreshTime", "", "getFilteredList", "", "process", "location", "Landroid/location/Location;", "locationKt", "pullingResult", "reset", "precision", "", "minPointCount", "setLocationCallback", "callback", "Companion", "app_debug"})
public final class KalmanProcessor {
    private com.github.windsekirun.kalmankt.model.LocationKt lastLocation;
    private boolean predicated = false;
    private boolean initialized = false;
    private com.github.windsekirun.kalmankt.filter.KalmanFilter latitudeTracker;
    private com.github.windsekirun.kalmankt.filter.KalmanFilter longitudeTracker;
    private com.github.windsekirun.kalmankt.filter.KalmanFilter altitudeTracker;
    private final com.github.windsekirun.kalmankt.filter.GeoHashFilter geoHashFilter = null;
    private long refreshTime = 1000L;
    private kotlin.jvm.functions.Function1<? super com.github.windsekirun.kalmankt.model.LocationKt, kotlin.Unit> locationCallback;
    private final android.os.Handler handler = null;
    public static final com.newlondonweb.tabbedfragmentdemo.data.KalmanProcessor.Companion Companion = null;
    
    public final void setLocationCallback(long refreshTime, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.github.windsekirun.kalmankt.model.LocationKt, kotlin.Unit> callback) {
    }
    
    public final void reset(int precision, int minPointCount) {
    }
    
    public final void process(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    public final void process(@org.jetbrains.annotations.NotNull()
    com.github.windsekirun.kalmankt.model.LocationKt locationKt) {
    }
    
    private final void pullingResult() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.github.windsekirun.kalmankt.model.LocationKt> getFilteredList() {
        return null;
    }
    
    public KalmanProcessor() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/data/KalmanProcessor$Companion;", "", "()V", "toLocationKt", "Lcom/github/windsekirun/kalmankt/model/LocationKt;", "data", "Landroid/location/Location;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.github.windsekirun.kalmankt.model.LocationKt toLocationKt(@org.jetbrains.annotations.NotNull()
        android.location.Location data) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}