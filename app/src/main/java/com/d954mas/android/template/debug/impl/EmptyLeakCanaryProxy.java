package com.d954mas.android.template.debug.impl;

import android.support.annotation.NonNull;

import com.d954mas.android.template.debug.iface.LeakCanaryProxy;

public class EmptyLeakCanaryProxy implements LeakCanaryProxy {
    @Override
    public void init() {//pass
    }

    @Override
    public void watch(@NonNull Object object) {//pass
    }
}
