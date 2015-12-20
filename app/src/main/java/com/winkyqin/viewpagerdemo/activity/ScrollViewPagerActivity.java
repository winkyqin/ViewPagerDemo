package com.winkyqin.viewpagerdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;

import com.winkyqin.viewpagerdemo.R;
import com.winkyqin.viewpagerdemo.adapter.TestFragmentPagerAdapter;
import com.winkyqin.viewpagerdemo.base.BaseFragment;
import com.winkyqin.viewpagerdemo.fragment.FragmentFour;
import com.winkyqin.viewpagerdemo.fragment.FragmentOne;
import com.winkyqin.viewpagerdemo.fragment.FragmentThree;
import com.winkyqin.viewpagerdemo.fragment.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * 开发者：WinkyQin
 * 日期：2015/12/20
 * 版权所有
 */
public class ScrollViewPagerActivity extends FragmentActivity {

    private ViewPager     mVpScrollPager;
    private TestFragmentPagerAdapter mPagerAdapter;
    private FragmentManager    mFragmentManager;
    private List<BaseFragment> mFragmentList;
    private List<String>       mTitles;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_viewpager);

        initView();
        initData();
        initListener();
    }

    private void initView() {
        mVpScrollPager = (ViewPager)     findViewById(R.id.vp_scroll_pager);
    }

    private void initData() {
        mFragmentList = new ArrayList<>();
        mFragmentList.add(new FragmentOne());
        mFragmentList.add(new FragmentTwo());
        mFragmentList.add(new FragmentThree());
        mFragmentList.add(new FragmentFour());

        mTitles = new ArrayList<>();
        mTitles.add(getString(R.string.fragment_one));
        mTitles.add(getString(R.string.fragment_two));
        mTitles.add(getString(R.string.fragment_three));
        mTitles.add(getString(R.string.fragment_four));

        mFragmentManager = getSupportFragmentManager();
        mPagerAdapter = new TestFragmentPagerAdapter(mFragmentManager, mFragmentList, mTitles);
        mVpScrollPager.setAdapter(mPagerAdapter);
    }

    private void initListener() {
        mVpScrollPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

}
