package com.d954mas.android.template.debug.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.d954mas.android.template.R;
import com.d954mas.android.template.debug.mvp.presenter.TinyDancerPresenter;
import com.d954mas.android.template.debug.mvp.view.TinyDancerView;
import com.d954mas.android.template.ui.fragments.BaseFragment;

import butterknife.BindView;

public class DebugFragment extends BaseFragment implements TinyDancerView {
    @BindView(R.id.toggle_tiny_dancer) Switch tinyDancerSwitcher;
    @InjectPresenter TinyDancerPresenter tinyDancerPresenter;

    @Nullable @Override public View onCreateView(LayoutInflater inflater,
                                                 @Nullable ViewGroup container,
                                                 @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.debug_fragment, container, false);
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tinyDancerSwitcher.setOnClickListener(v -> tinyDancerPresenter.toggleTinyDancer(getContext(), tinyDancerSwitcher.isChecked()));
    }

    @Override public void showTinyDancer(boolean show) {
        tinyDancerSwitcher.setChecked(show);
    }
}
