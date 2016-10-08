package com.d954mas.android.template.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.arellomobile.mvp.MvpDelegate;

public class MvpFragment extends Fragment {
    private MvpDelegate<? extends MvpFragment> mMvpDelegate;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getMvpDelegate().onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        this.getMvpDelegate().onAttach();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        this.getMvpDelegate().onDetach();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (this.isRemoving() || this.getActivity().isFinishing()) {
            this.getMvpDelegate().onDestroy();
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        this.getMvpDelegate().onSaveInstanceState(outState);
    }
    public MvpDelegate getMvpDelegate() {
        if (this.mMvpDelegate == null) {
            this.mMvpDelegate = new MvpDelegate<>(this);
        }
        return this.mMvpDelegate;
    }
}
