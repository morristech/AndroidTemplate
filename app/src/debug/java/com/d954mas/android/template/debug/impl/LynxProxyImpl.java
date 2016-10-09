package com.d954mas.android.template.debug.impl;


import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import com.d954mas.android.template.debug.iface.LynxProxy;
import com.github.pedrovgs.lynx.LynxActivity;
import com.github.pedrovgs.lynx.LynxConfig;
import com.github.pedrovgs.lynx.LynxShakeDetector;

public class LynxProxyImpl implements LynxProxy {
    @NonNull private final Application application;

    public LynxProxyImpl(@NonNull Application application) {
        this.application = application;
    }

    @Override public void init() {
        LynxShakeDetector lynxShakeDetector = new LynxShakeDetector(application);
        lynxShakeDetector.init();
    }

    @Override public void showLynx(Context context) {
        LynxConfig lynxConfig = new LynxConfig();
        Intent lynxActivityIntent = LynxActivity.getIntent(context, lynxConfig);
        context.startActivity(lynxActivityIntent);
    }
}
