package com.example.nurcahyadiperdana.banyumas.Kuliner;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nurcahyadiperdana.banyumas.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class map_kuliner1 extends Fragment implements OnMapReadyCallback {

    private GoogleMap googleMap;
    LatLng koordinat;

    public map_kuliner1(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_map_kuliner1, container, false);


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng marker = new LatLng(-7.416749,109.241991);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marker,18));
        googleMap.addMarker(new MarkerOptions().title("Iga Bakar Mas Giri").position(marker));

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment fragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        fragment.getMapAsync(this);
    }
}
