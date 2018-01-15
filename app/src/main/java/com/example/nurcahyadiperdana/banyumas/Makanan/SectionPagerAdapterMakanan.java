package com.example.nurcahyadiperdana.banyumas.Makanan;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.nurcahyadiperdana.banyumas.Kuliner.info_kuliner1;
import com.example.nurcahyadiperdana.banyumas.Kuliner.map_kuliner1;

/**
 * Created by nurcahyadiperdana on 11/4/17.
 */

class SectionPagerAdapterMakanan extends FragmentPagerAdapter {
    public SectionPagerAdapterMakanan(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                info_makanan1 kuliner = new info_makanan1();
                return kuliner;
            case 1:
                map_makanan1 map = new map_makanan1();
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
