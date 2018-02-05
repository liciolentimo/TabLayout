package com.lentimosystems.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LICIO on 2/5/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentListTitles = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListTitles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentListTitles.get(position);
    }
    public void AddFragment(Fragment fragment, String Title) {
        fragmentList.add(fragment);
        fragmentListTitles.add(Title);
    }
}
