package com.example.nurcahyadiperdana.banyumas.Wisata;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by nurcahyadiperdana on 11/5/17.
 */

class SectionPagerAdapterWisata1 extends FragmentPagerAdapter{
    public SectionPagerAdapterWisata1(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                info_wisata2 wisata = new info_wisata2();
                return wisata;
            case 1:
                map_wisata2 map = new map_wisata2();
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
