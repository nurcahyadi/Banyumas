package com.example.nurcahyadiperdana.banyumas;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nurcahyadiperdana.banyumas.Tas.pilih_tas;


public class deskripsi_tas extends Fragment {

    private TextView Test1,Test2;
    private ImageView test;

    public deskripsi_tas(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_deskripsi_tas, container, false);

        Test1 =(TextView) view.findViewById(R.id.test);
        Test2 =(TextView) view.findViewById(R.id.test1);
        test = (ImageView) view.findViewById(R.id.gambar);

        Test1.setText("TAS BARU");
        Test2.setText("Harganya adalah");

        Test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent af = new Intent(getActivity(),pilih_tas.class);
                startActivity(af);
            }
        });

        return view;
    }

}
