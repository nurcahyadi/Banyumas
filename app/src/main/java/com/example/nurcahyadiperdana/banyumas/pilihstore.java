package com.example.nurcahyadiperdana.banyumas;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class pilihstore extends AppCompatActivity {

    private ViewPager mViewPager;
    private SectionPagerAdapter msectionPagerAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihstore);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbarstore);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Pilih Store");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = (ViewPager) findViewById(R.id.tabPager);
        msectionPagerAdapter = new SectionPagerAdapter(getSupportFragmentManager());

        mViewPager.setAdapter(msectionPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.maintabs);
        tabLayout.setupWithViewPager(mViewPager);

    }
}
