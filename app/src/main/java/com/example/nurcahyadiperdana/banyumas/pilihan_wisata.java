package com.example.nurcahyadiperdana.banyumas;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.nurcahyadiperdana.banyumas.Wisata.wisata1;
import com.example.nurcahyadiperdana.banyumas.Wisata.wisata2;
import com.example.nurcahyadiperdana.banyumas.Wisata.wisata3;

import java.util.ArrayList;
import java.util.HashMap;

public class pilihan_wisata extends Fragment {

    protected ListView ls;
    protected ListAdapter adapter;
    SimpleAdapter SAdapter;
    HashMap<String,String> map;
    ArrayList<HashMap<String,String>> mList;
    String[] Gbr;

    public pilihan_wisata() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pilihan_wisata, container, false);

        ls =(ListView) view.findViewById(R.id.lsview);

        Gbr = new String[]{
                Integer.toString(R.drawable.abb),
                Integer.toString(R.drawable.abb),
                Integer.toString(R.drawable.abc),
                Integer.toString(R.drawable.abc),
                Integer.toString(R.drawable.acc),
                Integer.toString(R.drawable.acc),
                Integer.toString(R.drawable.azz),
                Integer.toString(R.drawable.axx),
                Integer.toString(R.drawable.axx),
                Integer.toString(R.drawable.axx),
        };

        mList = new ArrayList<HashMap<String, String>>();

        for (int i =0;i<Gbr.length;i++){
            map = new HashMap<String,String>();
            map.put("gbr", Gbr[i]);
            mList.add(map);
        }

        SAdapter = new SimpleAdapter(getActivity(),mList,R.layout.activity_item_listview,new String[]{"gbr"}, new int []{R.id.gbr});
        ls.setAdapter(SAdapter);

        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent pindah = new Intent(getActivity(), wisata1.class);
                        startActivity(pindah);
                        break;
                    case 1 :
                        Intent pindah1 = new Intent(getActivity(),wisata2.class);
                        startActivity(pindah1);
                        break;
                    case 2:
                        Intent pindah2 = new Intent(getActivity(),wisata3.class);
                        startActivity(pindah2);
                }
            }
        });

        return view;
    }
}
