package com.d954mas.android.template.debug.impl;

import android.app.Application;
import android.support.annotation.NonNull;

import com.d954mas.android.template.debug.iface.StethoProxy;
import com.facebook.stetho.Stetho;

public class StethoProxyImpl implements StethoProxy {
    @NonNull private final Application application;

    public StethoProxyImpl(@NonNull Application application) {
        this.application = application;
    }

    @Override
    public void init() {
        Stetho.initializeWithDefaults(application);
    }
}
