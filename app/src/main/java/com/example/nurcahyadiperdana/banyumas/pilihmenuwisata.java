package com.example.nurcahyadiperdana.banyumas;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class pilihmenuwisata extends AppCompatActivity {

    private ViewPager mViewPager;
    private SectionPagerAdapter1 msectionPagerAdapter;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihmenuwisata);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbarpilwis);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Pariwisata");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = (ViewPager) findViewById(R.id.tabPager);
        msectionPagerAdapter = new SectionPagerAdapter1(getSupportFragmentManager());

        mViewPager.setAdapter(msectionPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.maintabs);
        tabLayout.setupWithViewPager(mViewPager);

    }
}
