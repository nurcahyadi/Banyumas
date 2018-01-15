package com.example.nurcahyadiperdana.banyumas.Wisata;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.nurcahyadiperdana.banyumas.R;

public class wisata2 extends AppCompatActivity {
    private ViewPager mViewPager;
    private SectionPagerAdapterWisata1 msectionPagerAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbarwisata2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Telaga Sunyi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = (ViewPager) findViewById(R.id.tabPager);
        msectionPagerAdapter = new SectionPagerAdapterWisata1(getSupportFragmentManager());

        mViewPager.setAdapter(msectionPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.maintabs);
        tabLayout.setupWithViewPager(mViewPager);
    }
}
