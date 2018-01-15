package com.example.nurcahyadiperdana.banyumas.Wisata;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.nurcahyadiperdana.banyumas.R;

public class wisata3 extends AppCompatActivity {
    private ViewPager mViewPager;
    private SectionPagerAdapterWisata2 msectionPagerAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata3);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbarwisata3);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Andhang Pangrenan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = (ViewPager) findViewById(R.id.tabPager);
        msectionPagerAdapter = new SectionPagerAdapterWisata2(getSupportFragmentManager());

        mViewPager.setAdapter(msectionPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.maintabs);
        tabLayout.setupWithViewPager(mViewPager);
    }
}
