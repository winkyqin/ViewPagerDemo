package com.winkyqin.viewpagerdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.winkyqin.viewpagerdemo.R;

/**
 * 开发者：WinkyQin
 * 日期：2015/12/20
 * 版权所有
 */
public class NoScrollViewPagerActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_scroll_viewpager);
    }

}
