package com.example.nurcahyadiperdana.banyumas;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.BaseAdapter;

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
                deskripsi_timeline timeline = new deskripsi_timeline();
                return timeline;
            case 1:
                pilihan_wisata wisata = new pilihan_wisata();
                return wisata;
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
                    return "Timeline";

                case 1 :
                    return "Wisata";

                default:
                    return null;
            }
        }
}
