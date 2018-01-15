package com.example.nurcahyadiperdana.banyumas.Kuliner;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.nurcahyadiperdana.banyumas.R;

public class kuliner1 extends AppCompatActivity {

    private ViewPager mViewPager;
    private SectionPagerAdapterKuliner msectionPagerAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbarkuliner);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Iga Bakar Mas Giri");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = (ViewPager) findViewById(R.id.tabPager);
        msectionPagerAdapter = new SectionPagerAdapterKuliner(getSupportFragmentManager());

        mViewPager.setAdapter(msectionPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.maintabs);
        tabLayout.setupWithViewPager(mViewPager);

    }
}
