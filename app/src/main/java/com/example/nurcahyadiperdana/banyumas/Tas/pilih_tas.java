package com.example.nurcahyadiperdana.banyumas.Tas;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.nurcahyadiperdana.banyumas.R;

public class pilih_tas extends AppCompatActivity {

    private ViewPager mViewPager;
    private SectionPagerAdapter1 msectionPagerAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_tas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbarpilihtas1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Tas");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = (ViewPager) findViewById(R.id.tabPager);
        msectionPagerAdapter = new SectionPagerAdapter1(getSupportFragmentManager());

        mViewPager.setAdapter(msectionPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.maintabs);
        tabLayout.setupWithViewPager(mViewPager);
    }
}
