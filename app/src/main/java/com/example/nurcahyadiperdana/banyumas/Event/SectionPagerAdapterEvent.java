package com.example.nurcahyadiperdana.banyumas.Event;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.nurcahyadiperdana.banyumas.Wisata.info_wisata1;
import com.example.nurcahyadiperdana.banyumas.Wisata.map_wisata1;

/**
 * Created by nurcahyadiperdana on 11/4/17.
 */

class SectionPagerAdapterEvent extends FragmentPagerAdapter {
    public SectionPagerAdapterEvent(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                info_event1 wisata = new info_event1();
                return wisata;
            case 1:
                map_event1 map = new map_event1();
                return map;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Informasi";

            case 1:
                return "Map";

            default:
                return null;
        }
    }
}
