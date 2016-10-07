package com.d954mas.android.template.debug.impl;

import android.app.Application;
import android.support.annotation.NonNull;

import com.d954mas.android.template.debug.iface.DevMetricsProxy;
import com.frogermcs.androiddevmetrics.AndroidDevMetrics;

public class DevMetricsProxyImpl implements DevMetricsProxy {
    @NonNull private final Application application;

    public DevMetricsProxyImpl(@NonNull final Application application) {
        this.application = application;
    }

    @Override
    public void init() {
        AndroidDevMetrics.initWith(application);
    }
}
