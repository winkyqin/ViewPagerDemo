package com.winkyqin.viewpagerdemo.fragment;

import android.view.View;

import com.winkyqin.viewpagerdemo.R;
import com.winkyqin.viewpagerdemo.base.BaseFragment;

/**
 * 开发者：WinkyQin
 * 日期：2015/12/20
 * 版权所有
 */
public class FragmentFour extends BaseFragment {

    @Override
    protected View initView() {
        View view = View.inflate(mActivity, R.layout.layout_fragment_four, null);
        return view;
    }

}
