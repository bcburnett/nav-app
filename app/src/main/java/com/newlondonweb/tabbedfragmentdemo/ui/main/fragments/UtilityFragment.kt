package com.newlondonweb.tabbedfragmentdemo.ui.main.fragments

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Context.LOCATION_SERVICE
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Color
import android.location.Location
import android.location.LocationManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.github.windsekirun.kalmankt.model.LocationKt
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.CircleOptions
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.maps.android.data.kml.KmlLayer
import com.newlondonweb.tabbedfragmentdemo.R
import com.newlondonweb.tabbedfragmentdemo.R.layout.utility_fragment
import com.newlondonweb.tabbedfragmentdemo.data.AppDataBase
import com.newlondonweb.tabbedfragmentdemo.viewModels.UtilityViewModel
import kotlinx.android.synthetic.main.utility_fragment.*
import java.util.ArrayList

private const val REQUEST_IMAGE_CAPTURE = 1

class UtilityFragment : Fragment(), LifecycleOwner, OnMapReadyCallback, OnClickListener {
    lateinit var mMap: GoogleMap

    companion object {
        @Volatile
        private var INSTANCE: UtilityFragment? = null
        fun getInstance(): UtilityFragment {
            if (INSTANCE == null) INSTANCE = UtilityFragment()
            return INSTANCE as UtilityFragment
        }
    }

    private val vm: UtilityViewModel by lazy {
        this.activity.let {
            ViewModelProvider(it!!).get(
                UtilityViewModel::class.java
            )
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) =
        inflater.inflate(utility_fragment, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
// get permission for fine position
        if (Build.VERSION.SDK_INT >= 23 && (ActivityCompat.checkSelfPermission(
                this.requireContext(),
                android.Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED)
        ) {
            requestPermissions(arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), 123)
        }

//        // observers
        vm.locations.observe(viewLifecycleOwner, Observer { doDisplay(it) })
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        map?.apply {
            onCreate(null)
            onResume()
            getMapAsync(this@UtilityFragment)
        }
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.mapType = GoogleMap.MAP_TYPE_HYBRID
        vm.updateScreen.run()
    }

    private fun doDisplay(locList: List<Location>) {
        if (!::mMap.isInitialized) return

        val kml = resources.openRawResource(R.raw.waldenstreetmarket)

        acc_view.text = locList.last().accuracy.toString()
        mMap.clear()

        try {
            val kmlLayer = KmlLayer(mMap, kml, this.requireContext())
            val pathPoints = ArrayList<LatLng>()

            if (kmlLayer.containers != null) {
                kmlLayer.containers.forEach { kmlContainer ->
                    kmlContainer.placemarks.forEach {
                        if (it.geometry.geometryType == "Point") {
                            pathPoints.add(it.geometry.geometryObject as LatLng)
                        }
                    }
                }
            }

            pathPoints.forEach {
                mMap.addMarker(MarkerOptions().position(it).alpha(0.25F))
            }
            kmlLayer.addLayerToMap()
        } catch (e: Exception) {
            Log.d("marker", e.toString()); return
        }

        val me = LatLng(locList.last().latitude, locList.last().longitude)
        locList.forEach {
            Log.d("marker", it.toString())
            mMap.addMarker(
                MarkerOptions()
                    .position(LatLng(it.latitude, it.longitude))
                    .title(me.toString())
                    .icon(BitmapDescriptorFactory.defaultMarker())
            )
        }


        mMap.addCircle(
            CircleOptions()
                .center(me)
                .radius(locList.last().accuracy.toDouble())
        )

        val zoom: Float =
            if (mMap.cameraPosition.zoom.toInt() == 2) 16f else mMap.cameraPosition.zoom
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(me, zoom))
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    override fun onClick(v: View?) {
        Log.d("marker", v?.tag.toString())
    }


}

