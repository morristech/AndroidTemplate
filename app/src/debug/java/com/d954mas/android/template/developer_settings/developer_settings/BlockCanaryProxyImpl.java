package com.d954mas.android.template.developer_settings.developer_settings;


import android.app.Application;
import android.support.annotation.NonNull;

import com.d954mas.android.template.developer_settings.iface.BlockCanaryProxy;
import com.github.moduth.blockcanary.BlockCanary;
import com.github.moduth.blockcanary.BlockCanaryContext;

public class BlockCanaryProxyImpl implements BlockCanaryProxy {
    @NonNull private final Application app;

    public BlockCanaryProxyImpl(@NonNull Application app) {
        this.app = app;
    }

    @Override
    public void init() {
        BlockCanary.install(app, new BlockCanaryContext());
    }
}
