package com.example.nurcahyadiperdana.banyumas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import com.example.nurcahyadiperdana.banyumas.Adapter.ImageAdapter;
public class MainActivity extends AppCompatActivity {

    ImageView as ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        as = (ImageView) findViewById(R.id.display);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbarmain);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Pilih Destinasi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(getApplicationContext()));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent pindah = new Intent(MainActivity.this,pilihstore.class);
                        startActivity(pindah);
                        break;

                    case 1:
                        Intent pindah3 = new Intent(MainActivity.this,pilihmenuwisata.class);
                        startActivity(pindah3);
                        break;

                    case 2:
                        Intent pindah1 = new Intent(MainActivity.this,pilihan_kuliner.class);
                        startActivity(pindah1);
                        break;

                    case 3:
                        Intent pindah2 = new Intent(MainActivity.this,pilihan_event.class);
                        startActivity(pindah2);
                        break;
                }
            }
        });

    }
}
