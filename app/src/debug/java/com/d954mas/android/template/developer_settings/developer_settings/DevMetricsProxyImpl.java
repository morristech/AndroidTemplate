package com.d954mas.android.template.developer_settings.developer_settings;

import android.app.Application;
import android.support.annotation.NonNull;

import com.d954mas.android.template.developer_settings.iface.DevMetricsProxy;
import com.frogermcs.androiddevmetrics.AndroidDevMetrics;

public class DevMetricsProxyImpl implements DevMetricsProxy {
    private final Application application;

    public DevMetricsProxyImpl(@NonNull final Application application) {
        this.application = application;
    }

    @Override
    public void init() {
        AndroidDevMetrics.initWith(application);
    }
}
