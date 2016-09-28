package com.d954mas.android.template.developer_settings.impl;

import android.app.Activity;
import android.view.ViewGroup;

import com.d954mas.android.template.developer_settings.iface.ViewContainer;

import static butterknife.ButterKnife.findById;

public class EmptyViewContainer implements ViewContainer {
    @Override
    public ViewGroup forActivity(Activity activity) {
        return findById(activity, android.R.id.content);
    }
}
