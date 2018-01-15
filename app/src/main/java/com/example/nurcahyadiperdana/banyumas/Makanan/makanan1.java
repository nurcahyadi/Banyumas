package com.example.nurcahyadiperdana.banyumas.Makanan;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.nurcahyadiperdana.banyumas.R;

public class makanan1 extends AppCompatActivity {

    private ViewPager mViewPager;
    private SectionPagerAdapterMakanan msectionPagerAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbarmakanan1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Gethuk Goreng");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = (ViewPager) findViewById(R.id.tabPager);
        msectionPagerAdapter = new SectionPagerAdapterMakanan(getSupportFragmentManager());

        mViewPager.setAdapter(msectionPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.maintabs);
        tabLayout.setupWithViewPager(mViewPager);

    }
}
