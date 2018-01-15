package com.example.nurcahyadiperdana.banyumas.Wisata;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.nurcahyadiperdana.banyumas.R;

public class wisata1 extends AppCompatActivity {

    private ViewPager mViewPager;
    private SectionPagerAdapterWisata msectionPagerAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbarwisata);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Curug");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = (ViewPager) findViewById(R.id.tabPager);
        msectionPagerAdapter = new SectionPagerAdapterWisata(getSupportFragmentManager());

        mViewPager.setAdapter(msectionPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.maintabs);
        tabLayout.setupWithViewPager(mViewPager);

    }
}
