package com.example.nurcahyadiperdana.banyumas.Event;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.nurcahyadiperdana.banyumas.R;

public class event1 extends AppCompatActivity {

    private ViewPager mViewPager;
    private SectionPagerAdapterEvent msectionPagerAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbarevent1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Hackathon Banyumas");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = (ViewPager) findViewById(R.id.tabPager);
        msectionPagerAdapter = new SectionPagerAdapterEvent(getSupportFragmentManager());

        mViewPager.setAdapter(msectionPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.maintabs);
        tabLayout.setupWithViewPager(mViewPager);

    }
}
