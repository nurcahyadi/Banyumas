package com.example.nurcahyadiperdana.banyumas;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by nurcahyadiperdana on 11/4/17.
 */

class SectionPagerAdapter extends FragmentPagerAdapter {
    public SectionPagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                deskripsi_baju baju = new deskripsi_baju();
                return baju;
            case 1:
                deskripsi_makanan makanan = new deskripsi_makanan();
                return makanan;
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
                return "Baju";

            case 1 :
                return "Makanan";


            default:
                return null;
        }
    }
}
