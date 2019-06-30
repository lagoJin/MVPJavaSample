package com.lago.kr.mvpjavasample.contract;

import com.lago.kr.mvpjavasample.base.BasePresenter;
import com.lago.kr.mvpjavasample.base.BaseView;

public interface MainContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {

    }

}
