package com.newlondonweb.tabbedfragmentdemo.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u00101\u001a\u00020\b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\u0013J\u000e\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020&J\u000e\u00105\u001a\u0002062\u0006\u00107\u001a\u00020&J\u000e\u00108\u001a\u0002062\u0006\u00109\u001a\u00020:J\u000e\u0010;\u001a\u0002062\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00130\u00128@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00130#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020\b0%j\b\u0012\u0004\u0012\u00020\b`(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u0011\u0010-\u001a\u00020.\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100\u00a8\u0006<"}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/viewModels/UtilityViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "kalmanProcessor", "Lcom/newlondonweb/tabbedfragmentdemo/data/KalmanProcessor;", "location", "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "locationManager", "Landroid/location/LocationManager;", "getLocationManager", "()Landroid/location/LocationManager;", "setLocationManager", "(Landroid/location/LocationManager;)V", "locations", "Landroidx/lifecycle/LiveData;", "", "getLocations$app_debug", "()Landroidx/lifecycle/LiveData;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "getMMap", "()Lcom/google/android/gms/maps/GoogleMap;", "setMMap", "(Lcom/google/android/gms/maps/GoogleMap;)V", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "setMainHandler", "(Landroid/os/Handler;)V", "myLocations", "Landroidx/lifecycle/MutableLiveData;", "myloc", "Ljava/util/ArrayList;", "Lcom/github/windsekirun/kalmankt/model/LocationKt;", "track", "Lkotlin/collections/ArrayList;", "getTrack", "()Ljava/util/ArrayList;", "track$delegate", "Lkotlin/Lazy;", "updateScreen", "Ljava/lang/Runnable;", "getUpdateScreen", "()Ljava/lang/Runnable;", "avgLocs", "list", "fromLocationKt", "data", "processLocation", "", "locationKt", "reset", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "setup", "app_debug"})
public final class UtilityViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    public android.location.LocationManager locationManager;
    @org.jetbrains.annotations.NotNull()
    public android.os.Handler mainHandler;
    private final com.newlondonweb.tabbedfragmentdemo.data.KalmanProcessor kalmanProcessor = null;
    private final kotlin.Lazy track$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.GoogleMap mMap;
    private final androidx.lifecycle.MutableLiveData<java.util.List<android.location.Location>> myLocations = null;
    private final java.util.ArrayList<com.github.windsekirun.kalmankt.model.LocationKt> myloc = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable updateScreen = null;
    @org.jetbrains.annotations.NotNull()
    private final android.location.Location location = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.LocationManager getLocationManager() {
        return null;
    }
    
    public final void setLocationManager(@org.jetbrains.annotations.NotNull()
    android.location.LocationManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getMainHandler() {
        return null;
    }
    
    public final void setMainHandler(@org.jetbrains.annotations.NotNull()
    android.os.Handler p0) {
    }
    
    private final java.util.ArrayList<android.location.Location> getTrack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.GoogleMap getMMap() {
        return null;
    }
    
    public final void setMMap(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<android.location.Location>> getLocations$app_debug() {
        return null;
    }
    
    public final void setup(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap mMap) {
    }
    
    public final void processLocation(@org.jetbrains.annotations.NotNull()
    com.github.windsekirun.kalmankt.model.LocationKt locationKt) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Runnable getUpdateScreen() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.Location getLocation() {
        return null;
    }
    
    public final void reset(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.Location avgLocs(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends android.location.Location> list) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.Location fromLocationKt(@org.jetbrains.annotations.NotNull()
    com.github.windsekirun.kalmankt.model.LocationKt data) {
        return null;
    }
    
    public UtilityViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}