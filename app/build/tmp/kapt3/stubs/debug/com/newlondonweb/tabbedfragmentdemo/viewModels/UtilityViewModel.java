package com.newlondonweb.tabbedfragmentdemo.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0016j\b\u0012\u0004\u0012\u00020\f`\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006 "}, d2 = {"Lcom/newlondonweb/tabbedfragmentdemo/viewModels/UtilityViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "locationManager", "Landroid/location/LocationManager;", "getLocationManager", "()Landroid/location/LocationManager;", "locations", "Landroidx/lifecycle/LiveData;", "", "Landroid/location/Location;", "getLocations$app_debug", "()Landroidx/lifecycle/LiveData;", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "myLocations", "Landroidx/lifecycle/MutableLiveData;", "track", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTrack", "()Ljava/util/ArrayList;", "track$delegate", "Lkotlin/Lazy;", "updateScreen", "Ljava/lang/Runnable;", "getUpdateScreen", "()Ljava/lang/Runnable;", "app_debug"})
public final class UtilityViewModel extends androidx.lifecycle.AndroidViewModel {
    private final kotlin.Lazy track$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<android.location.Location>> myLocations = null;
    @org.jetbrains.annotations.NotNull()
    private final android.location.LocationManager locationManager = null;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler mainHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable updateScreen = null;
    
    private final java.util.ArrayList<android.location.Location> getTrack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<android.location.Location>> getLocations$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.LocationManager getLocationManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getMainHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Runnable getUpdateScreen() {
        return null;
    }
    
    public UtilityViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}