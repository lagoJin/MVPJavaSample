package com.lago.kr.mvpjavasample.mvp.presenter;

import com.lago.kr.mvpjavasample.contract.MainContract;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mainView;

    public MainPresenter(MainContract.View mainView) {
        this.mainView = mainView;
    }

}
