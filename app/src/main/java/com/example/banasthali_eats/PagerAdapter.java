package com.example.banasthali_eats;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    private int noOfTabs;
    public PagerAdapter(FragmentManager fm, int noOfTabs)
    {
        super(fm);
        this.noOfTabs=noOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                    Snacks s=new Snacks();
                    return s;
            case 1:
                Dessert d=new Dessert();
                return d;
            case 2:
                MCourse m=new MCourse();
                return m;
        }
        return null;
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
