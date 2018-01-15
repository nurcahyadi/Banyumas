package com.example.nurcahyadiperdana.banyumas.Event;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.nurcahyadiperdana.banyumas.Wisata.info_wisata1;
import com.example.nurcahyadiperdana.banyumas.Wisata.map_wisata1;

/**
 * Created by nurcahyadiperdana on 11/4/17.
 */

class SectionPagerAdapterEvent1 extends FragmentPagerAdapter {
    public SectionPagerAdapterEvent1(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                info_event2 event = new info_event2();
                return event;
            case 1:
                map_event2 map = new map_event2();
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
