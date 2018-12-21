package com.protocolhelper.ui.base;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableBoolean;

import io.reactivex.disposables.CompositeDisposable;

public abstract class BaseViewModel extends ViewModel {

    private final ObservableBoolean mIsLoading = new ObservableBoolean(false);

    private final ObservableBoolean mIsActive = new ObservableBoolean(true);

//    private final SchedulerProvider mSchedulerProvider;

    private CompositeDisposable mCompositeDisposable;

    public BaseViewModel() {
        this.mCompositeDisposable = new CompositeDisposable();
    }
//    public BaseViewModel(SchedulerProvider schedulerProvider) {
//        this.mSchedulerProvider = schedulerProvider;
//        this.mCompositeDisposable = new CompositeDisposable();
//    }

    @Override
    protected void onCleared() {
        mCompositeDisposable.dispose();
        super.onCleared();
    }

    public CompositeDisposable getCompositeDisposable() {
        return mCompositeDisposable;
    }

    public ObservableBoolean getIsLoading() {
        return mIsLoading;
    }

    public void setIsLoading(boolean isLoading) {
        mIsLoading.set(isLoading);
    }

    public ObservableBoolean getIsActive() {
        return mIsActive;
    }

    public void setIsActive(boolean isActive) {
        mIsActive.set(isActive);
    }

//    public SchedulerProvider getSchedulerProvider() {
//        return mSchedulerProvider;
//    }
}
