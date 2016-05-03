package com.example.digital05.digitalpoint;

import android.support.v4.app.Fragment;
import android.print.PageRange;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by digital05 on 5/3/16.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    int mNumberOfTabs;

    public PagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        mNumberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                AboutUsFragment aboutUsFragment = new AboutUsFragment();
                return aboutUsFragment;
            case 2:
                ContactUsFragment contactUsFragment = new ContactUsFragment();
                return contactUsFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumberOfTabs;
    }
}
