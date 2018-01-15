package com.example.nurcahyadiperdana.banyumas.Makanan;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import com.example.nurcahyadiperdana.banyumas.R;

public class makanan2 extends AppCompatActivity {

    private ViewPager mViewPager;
    private SectionPagerAdapterMakanan2 msectionPagerAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbarmakanan2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Jenang Jaket");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = (ViewPager) findViewById(R.id.tabPager);
        msectionPagerAdapter = new SectionPagerAdapterMakanan2(getSupportFragmentManager());

        mViewPager.setAdapter(msectionPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.maintabs);
        tabLayout.setupWithViewPager(mViewPager);

    }
}
