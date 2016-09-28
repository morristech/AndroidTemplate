package com.d954mas.android.template.developer_settings.impl;

import android.support.annotation.NonNull;

import com.d954mas.android.template.developer_settings.iface.LeakCanaryProxy;

public class EmptyLeakCanaryProxy implements LeakCanaryProxy {
    @Override
    public void init() {
    }

    @Override
    public void watch(@NonNull Object object) {
    }
}
