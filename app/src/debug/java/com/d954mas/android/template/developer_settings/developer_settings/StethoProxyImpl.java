package com.d954mas.android.template.developer_settings.developer_settings;

import android.app.Application;
import android.support.annotation.NonNull;

import com.d954mas.android.template.developer_settings.iface.StethoProxy;
import com.facebook.stetho.Stetho;

public class StethoProxyImpl implements StethoProxy {
    @NonNull
    private final Application application;

    public StethoProxyImpl(Application application) {
        this.application = application;
    }

    @Override
    public void init() {
        Stetho.initializeWithDefaults(application);
    }
}
