package com.d954mas.android.template.ui.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.d954mas.android.template.BaseApp;

import butterknife.ButterKnife;
import butterknife.Unbinder;

@SuppressWarnings("PMD.AbstractClassWithoutAnyMethod")

public abstract class BaseFragment extends MvpFragment {
    private final Handler mainThreadHandler;
    private Unbinder viewBinder;

    public BaseFragment() {
        mainThreadHandler = new Handler(Looper.getMainLooper());
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewBinder = ButterKnife.bind(this, view);
    }

    protected void runOnUiThreadIfFragmentAlive(@NonNull Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper() && isFragmentAlive()) {
            runnable.run();
        } else {
            mainThreadHandler.post(() -> {
                if (isFragmentAlive()) {
                    runnable.run();
                }
            });
        }
    }

    private boolean isFragmentAlive() {
        return getActivity() != null && isAdded() && !isDetached() && getView() != null && !isRemoving();
    }

    @Override
    public void onDestroyView() {
        if (viewBinder != null) {
            viewBinder.unbind();
        }
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        BaseApp.get(getContext()).getAppComponent().leakCanaryProxy().watch(this);
        super.onDestroy();
    }
}
