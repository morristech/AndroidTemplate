package com.d954mas.android.template.developer_settings.developer_settings;


import android.app.Application;

import com.d954mas.android.template.developer_settings.iface.BlockCanaryProxy;
import com.github.moduth.blockcanary.BlockCanary;
import com.github.moduth.blockcanary.BlockCanaryContext;

public class BlockCanaryProxyImpl implements BlockCanaryProxy {
    private Application app;

    public BlockCanaryProxyImpl(Application app) {
        this.app = app;
    }

    @Override
    public void init() {
        BlockCanary.install(app, new BlockCanaryContext());
    }
}
