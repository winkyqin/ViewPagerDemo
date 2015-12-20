package com.winkyqin.viewpagerdemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.winkyqin.viewpagerdemo.base.BaseFragment;

import java.util.List;

/**
 * 开发者：WinkyQin
 * 日期：2015/12/20
 * 版权所有
 */
public class TestFragmentPagerAdapter extends FragmentPagerAdapter {

    private List<BaseFragment> mFragmentLists;
    private List<String>       mTitles;

    public TestFragmentPagerAdapter(FragmentManager fm,
                                     List<BaseFragment> fragmentList,
                                     List<String> titles) {
        super(fm);
        this.mFragmentLists = fragmentList;
        this.mTitles = titles;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(null != mTitles && !mTitles.isEmpty()){
            return mTitles.get(position);
        }
        return super.getPageTitle(position);
    }

    @Override
    public Fragment getItem(int position) {
        if(null != mFragmentLists){
            return mFragmentLists.get(position);
        }
        return null;
    }

    @Override
    public int getCount() {
        if(null != mFragmentLists){
            return mFragmentLists.size();
        }
        return 0;
    }
}
