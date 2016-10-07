package com.d954mas.android.template.debug.impl;


import android.content.Context;

import com.codemonkeylabs.fpslibrary.TinyDancer;
import com.d954mas.android.template.debug.iface.TinyDancerProxy;

import timber.log.Timber;

public class TinyDancerProxyImpl implements TinyDancerProxy {

    @Override public void showTinyDancer(Context context) {
        TinyDancer.create().show(context);
    }

    @Override public void hideTinyDancer(Context context) {
        try {
            TinyDancer.hide(context);
        } catch (Exception e) {
            // In some cases TinyDancer can not be hidden without exception: for example when you start it first time on Android 6.
            Timber.e(e, "Can not hide TinyDancer");
        }
    }


}
