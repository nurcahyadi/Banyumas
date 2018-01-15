package com.example.nurcahyadiperdana.banyumas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    Button visit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        visit = (Button) findViewById(R.id.kunjungi);

        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(HomeScreen.this, MainActivity.class);
                startActivity(a);
            }
        });

    }
}
