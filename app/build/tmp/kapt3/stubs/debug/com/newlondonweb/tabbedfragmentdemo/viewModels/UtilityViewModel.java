package com.newlondonweb.tabbedfragmentdemo.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010(\u001a\u00020\u001e2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001cj\b\u0012\u0004\u0012\u00020\u001e`\u001fJ\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0010J\u0006\u0010-\u001a\u00020+R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001cj\b\u0012\u0004\u0012\u00020\u001e`\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u0006."}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/viewModels/UtilityViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "kalmanProcessor", "Lcom/newlondonweb/tabbedfragmentdemo/data/KalmanProcessor;", "locationManager", "Landroid/location/LocationManager;", "getLocationManager", "()Landroid/location/LocationManager;", "setLocationManager", "(Landroid/location/LocationManager;)V", "locations", "Landroidx/lifecycle/LiveData;", "", "Lcom/github/windsekirun/kalmankt/model/LocationKt;", "getLocations$app_debug", "()Landroidx/lifecycle/LiveData;", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "setMainHandler", "(Landroid/os/Handler;)V", "myLocations", "Landroidx/lifecycle/MutableLiveData;", "myloc", "Ljava/util/ArrayList;", "track", "Landroid/location/Location;", "Lkotlin/collections/ArrayList;", "getTrack", "()Ljava/util/ArrayList;", "track$delegate", "Lkotlin/Lazy;", "updateScreen", "Ljava/lang/Runnable;", "getUpdateScreen", "()Ljava/lang/Runnable;", "avgLocs", "list", "processLocation", "", "locationKt", "setup", "app_debug"})
public final class UtilityViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    public android.location.LocationManager locationManager;
    @org.jetbrains.annotations.NotNull()
    public android.os.Handler mainHandler;
    private final com.newlondonweb.tabbedfragmentdemo.data.KalmanProcessor kalmanProcessor = null;
    private final kotlin.Lazy track$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.github.windsekirun.kalmankt.model.LocationKt>> myLocations = null;
    private final java.util.ArrayList<com.github.windsekirun.kalmankt.model.LocationKt> myloc = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable updateScreen = null;
    
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
    public final androidx.lifecycle.LiveData<java.util.List<com.github.windsekirun.kalmankt.model.LocationKt>> getLocations$app_debug() {
        return null;
    }
    
    public final void setup() {
    }
    
    public final void processLocation(@org.jetbrains.annotations.NotNull()
    com.github.windsekirun.kalmankt.model.LocationKt locationKt) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Runnable getUpdateScreen() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.Location avgLocs(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<android.location.Location> list) {
        return null;
    }
    
    public UtilityViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}