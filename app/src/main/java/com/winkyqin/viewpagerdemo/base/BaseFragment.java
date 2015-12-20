package com.winkyqin.viewpagerdemo.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 基类Fragment
 * 开发者：WinkyQin
 * 日期：2015/11/11
 * 版权所有
 */
public abstract class BaseFragment extends Fragment {

    protected Activity mActivity;
    protected FragmentManager mFragmentManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.mActivity  = getActivity();
        mFragmentManager = getFragmentManager();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return initView();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();
        initListener();
    }

    /**
     * 数据加载的方法
     */
    protected void initData() {
    }

    /**
     * 监听初始化
     */
    protected void initListener(){
    }

    protected abstract View initView();

}

