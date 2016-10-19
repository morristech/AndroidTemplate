package com.d954mas.android.template.debug.impl;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup;

import com.d954mas.android.template.App;
import com.d954mas.android.template.R;
import com.d954mas.android.template.debug.fragments.DebugFragment;
import com.d954mas.android.template.debug.iface.ViewContainer;
import com.d954mas.android.template.singleton.components.DaggerDebugAppComponent;

public class ViewContainerImpl implements ViewContainer {
    private static final String DEBUG_FRAGMENT_TAG = "DEBUG_FRAGMENT_TAG";

    @Override
    public ViewGroup forActivity(Activity activity) {
        ((DaggerDebugAppComponent) App.get(activity).getAppComponent()).inject(this);
        activity.setContentView(R.layout.debug_activity_frame);
        return (ViewGroup) activity.findViewById(R.id.debug_content);
    }

    @Override public void initDebugView(Activity activity) {
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        if (fragmentActivity.getSupportFragmentManager().findFragmentByTag(DEBUG_FRAGMENT_TAG) == null) {
            fragmentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.debug_container, new DebugFragment(), DEBUG_FRAGMENT_TAG).commit();
        }
    }


}
