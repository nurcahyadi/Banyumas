package com.example.nurcahyadiperdana.banyumas.Tas;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.nurcahyadiperdana.banyumas.deskripsi_timeline;
import com.example.nurcahyadiperdana.banyumas.pilihan_wisata;

/**
 * Created by nurcahyadiperdana on 11/4/17.
 */

class SectionPagerAdapter1 extends FragmentPagerAdapter {

    public SectionPagerAdapter1(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                deskripsi_toko toko = new deskripsi_toko();
                return toko;
            case 1:
                map_toko map = new map_toko();
                return map;

            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return 2;
    }
    public CharSequence getPageTitle(int position){
            switch (position){
                case 0 :
                    return "Deskripsi";

                case 1 :
                    return "Map";



                default:
                    return null;
            }
        }
}
