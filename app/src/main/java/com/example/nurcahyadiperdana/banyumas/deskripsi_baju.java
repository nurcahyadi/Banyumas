package com.example.nurcahyadiperdana.banyumas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.nurcahyadiperdana.banyumas.Baju.baju1;

import com.example.nurcahyadiperdana.banyumas.Baju.baju2;


public class deskripsi_baju extends Fragment {

    private TextView Test1,Test2;
    private ImageView test;

    public deskripsi_baju(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_deskripsi_tas, container, false);

        Test1 =(TextView) view.findViewById(R.id.test1);
        Test2 =(TextView) view.findViewById(R.id.pas1);
        test = (ImageView) view.findViewById(R.id.gambar);

        Test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getActivity(),baju1.class);
                startActivity(a);
            }
        });

        Test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getActivity(),baju2.class);
                startActivity(a);
            }
        });
        return view;
    }

}
