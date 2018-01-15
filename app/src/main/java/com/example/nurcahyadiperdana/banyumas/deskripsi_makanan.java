package com.example.nurcahyadiperdana.banyumas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nurcahyadiperdana.banyumas.Makanan.makanan1;

import com.example.nurcahyadiperdana.banyumas.Makanan.makanan2;


public class deskripsi_makanan extends Fragment {

    private TextView Test1,Test2;
    private ImageView test;

    public deskripsi_makanan(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_deskripsi_makanan, container, false);

        Test1 =(TextView) view.findViewById(R.id.test1);
        Test2 =(TextView) view.findViewById(R.id.pas1);
        test = (ImageView) view.findViewById(R.id.gambar);

        Test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(getActivity(), makanan1.class);
                startActivity(b);
            }
        });

        Test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(getActivity(),makanan2.class);
                startActivity(f);
            }
        });

        return view;
    }

}
