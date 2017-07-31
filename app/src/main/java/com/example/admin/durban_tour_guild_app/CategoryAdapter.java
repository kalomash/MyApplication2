package com.example.admin.durban_tour_guild_app;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Admin on 7/28/2017.
 */

public class CategoryAdapter  extends FragmentPagerAdapter{
    private Context mContext;

    public CategoryAdapter( Context context,FragmentManager fm) {
        super(fm);
        mContext =context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position ==0)
        {
            return  new MuseumFragment();
        }
//        else if (position ==1)
//        {
//            //return  new NaturepartsFragment();
//        }
//        else if (position ==2)
//        {
//           // return  new ShoreexcursionFragment();
//        }else {
//           // return new ReligiousFragment();
//        }
        return  new MuseumFragment();
        }





    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position ==0) {
            return "Museum";
        }

        if (position ==1) {
            return "Nature";
        }

        if (position ==2) {
            return "excursion";
        }else {
            return "Religious";
        }

    }
}
