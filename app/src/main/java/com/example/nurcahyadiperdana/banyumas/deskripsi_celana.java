package com.example.nurcahyadiperdana.banyumas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class deskripsi_celana extends Fragment {

    private TextView Test1,Test2;
    private ImageView test;

    public deskripsi_celana(){}
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

        return view;
    }

}
