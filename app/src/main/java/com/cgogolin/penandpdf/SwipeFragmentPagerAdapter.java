package com.cgogolin.penandpdf;

import android.app.Fragment;
import android.app.FragmentManager;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class SwipeFragmentPagerAdapter extends FragmentPagerAdapter { //Extends a slightly modified version of FragmentPagerAdapter

    private LayoutInflater mInflater;
    private List<Fragment> pages = new ArrayList<Fragment>();

    public SwipeFragmentPagerAdapter(FragmentManager fragmentManager, LayoutInflater inflater) {
        super(fragmentManager);
        mInflater = inflater;
    }

    public void add(Fragment fragment) {
        pages.add(fragment);
    }

    @Override
    public Fragment getItem(int position) {
        return pages.get(position);
    }


    @Override
    public int getCount() {
        return pages.size();
    }

}
