package com.lago.kr.mvpjavasample.base;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public abstract class BaseActivity<T extends ViewDataBinding> extends AppCompatActivity {

    private int layoutId;
    protected T mBinder;
    protected String TAG;

    protected static final ArrayList<Activity> activityList = new ArrayList<>();

    public BaseActivity(int layoutId) {
        this.layoutId = layoutId;
        TAG = "";
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinder = DataBindingUtil.setContentView(this, layoutId);
        activityList.add(this);
        initView();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        activityList.remove(this);
        super.onDestroy();
    }
    protected abstract void initView();

}