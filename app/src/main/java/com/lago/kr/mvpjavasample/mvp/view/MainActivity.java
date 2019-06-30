package com.lago.kr.mvpjavasample.mvp.view;

import android.content.Context;

import com.lago.kr.mvpjavasample.R;
import com.lago.kr.mvpjavasample.base.BaseActivity;
import com.lago.kr.mvpjavasample.contract.MainContract;
import com.lago.kr.mvpjavasample.databinding.ActivityMainBinding;
import com.lago.kr.mvpjavasample.mvp.presenter.MainPresenter;

public class MainActivity extends BaseActivity<ActivityMainBinding> implements MainContract.View {

    private MainContract.Presenter mPresenter;

    public MainActivity() {
        super(R.layout.activity_main);
        mPresenter = new MainPresenter(this);
    }

    @Override
    protected void initView() {

    }

    @Override
    public Context getContext() {
        return this;
    }
}