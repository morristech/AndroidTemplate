package com.d954mas.android.template.debug.fragments;


import android.widget.TextView;

import com.d954mas.android.template.R;
import com.d954mas.android.template.ui.fragments.BaseFragment;

import butterknife.BindView;

public class BaseDebugFragment extends BaseFragment {
    @BindView(R.id.debug_title) TextView debugTitleLabel;

    protected void setTitle(String title) {
        debugTitleLabel.setText(title);
    }
}
