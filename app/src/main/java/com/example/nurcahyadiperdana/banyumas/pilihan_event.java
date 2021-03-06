package com.example.nurcahyadiperdana.banyumas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;


import java.util.ArrayList;
import java.util.HashMap;

import com.example.nurcahyadiperdana.banyumas.Event.event1;

import com.example.nurcahyadiperdana.banyumas.Event.event2;

public class pilihan_event extends AppCompatActivity {

    protected ListView ls;
    protected ListAdapter adapter;
    SimpleAdapter SAdapter;
    HashMap<String,String> map;
    ArrayList<HashMap<String,String>> mList;
    String[] Gbr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan_event);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbarevent);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Event");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    ls =(ListView) findViewById(R.id.lsview);

    Gbr = new String[]{
        Integer.toString(R.drawable.event1),
                Integer.toString(R.drawable.event2),

    };

    mList = new ArrayList<HashMap<String, String>>();

        for (int i =0;i<Gbr.length;i++){
        map = new HashMap<String,String>();
        map.put("gbr", Gbr[i]);
        mList.add(map);
    }

    SAdapter = new SimpleAdapter(this,mList,R.layout.activity_item_listview,new String[]{"gbr"}, new int []{R.id.gbr});
        ls.setAdapter(SAdapter);

        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i){
                case 0:
                    Intent pindah = new Intent(pilihan_event.this, event1.class);
                    startActivity(pindah);
                    break;
                case 1 :
                    Intent pindah1 = new Intent(pilihan_event.this,event2.class);
                    startActivity(pindah1);
                    break;

            }
        }
    });

}
}
