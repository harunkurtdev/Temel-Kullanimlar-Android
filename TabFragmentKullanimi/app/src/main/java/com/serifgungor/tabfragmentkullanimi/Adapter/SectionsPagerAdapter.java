package com.serifgungor.tabfragmentkullanimi.Adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.serifgungor.tabfragmentkullanimi.Fragment.FragmentPage1;
import com.serifgungor.tabfragmentkullanimi.Fragment.FragmentPage2;
import com.serifgungor.tabfragmentkullanimi.Fragment.FragmentPage3;
import com.serifgungor.tabfragmentkullanimi.R;


public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private static final String[] TAB_BASLIKLARI = {"BAŞLIK 1", "BAŞLIK 2", "BAŞLIK 3"};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // Tıklanan Tab'in yönlendirileceği Fragment sınıfını temsil eder.
        Fragment fragment;
        switch (position) {
            case 0:
                FragmentPage1 fragmentPage1 = new FragmentPage1();
                fragment = fragmentPage1;
                break;
            case 1:
                FragmentPage2 fragmentPage2 = new FragmentPage2();
                fragment = fragmentPage2;
                break;
            case 2:
                FragmentPage3 fragmentPage3 = new FragmentPage3();
                fragment = fragmentPage3;
                break;
            default:
                FragmentPage1 fragmentPage0 = new FragmentPage1();
                fragment = fragmentPage0;
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        //Tab'in başlığını String[] içerisinden çektik.
        return TAB_BASLIKLARI[position];
    }

    @Override
    public int getCount() {
        // Tab'lerin sayısını döner
        return TAB_BASLIKLARI.length;
    }
}
