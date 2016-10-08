package com.d954mas.android.template.debug.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.d954mas.android.template.R;
import com.d954mas.android.template.debug.mvp.presenter.ScalpelPresenter;
import com.d954mas.android.template.debug.mvp.view.ScalpelView;
import com.d954mas.android.template.ui.fragments.BaseFragment;
import com.jakewharton.scalpel.ScalpelFrameLayout;

import butterknife.BindView;


public class ScalpelFragment extends BaseFragment implements ScalpelView {
    @BindView(R.id.toggle_enable_scalpel) Switch scalpelSwitch;
    @BindView(R.id.toggle_disable_graphics) Switch graphicsSwitch;
    @BindView(R.id.toggle_show_id) Switch idsSwitch;
    ScalpelFrameLayout scalpelFrameLayout;

    @InjectPresenter ScalpelPresenter scalpelPresenter;

    @Nullable @Override public View onCreateView(LayoutInflater inflater,
                                                 @Nullable ViewGroup container,
                                                 @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.debug_scalpel_fragment, container, false);
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        scalpelSwitch.setOnClickListener(v -> scalpelPresenter.setEnableScalpel(scalpelSwitch.isChecked()));
        graphicsSwitch.setOnClickListener(v -> scalpelPresenter.setShowGraphics(graphicsSwitch.isChecked()));
        idsSwitch.setOnClickListener(v -> scalpelPresenter.setShowIds(idsSwitch.isChecked()));
        scalpelFrameLayout = (ScalpelFrameLayout) getActivity().findViewById(R.id.debug_content);
    }

    @Override public void onDestroyView() {
        super.onDestroyView();
        scalpelFrameLayout = null;
    }

    @Override public void enableScalpel(boolean enable) {
        scalpelFrameLayout.setLayerInteractionEnabled(enable);
    }

    @Override public void disableGraphics(boolean disable) {
        scalpelFrameLayout.setDrawViews(!disable);
    }

    @Override public void showIds(boolean show) {
        scalpelFrameLayout.setDrawIds(show);
    }
}
