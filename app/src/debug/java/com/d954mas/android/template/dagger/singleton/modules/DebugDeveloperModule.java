package com.d954mas.android.template.dagger.singleton.modules;

import android.app.Application;
import android.support.annotation.NonNull;

import com.d954mas.android.template.debug.iface.BlockCanaryProxy;
import com.d954mas.android.template.debug.iface.DevMetricsProxy;
import com.d954mas.android.template.debug.iface.LeakCanaryProxy;
import com.d954mas.android.template.debug.iface.LynxProxy;
import com.d954mas.android.template.debug.iface.StethoProxy;
import com.d954mas.android.template.debug.iface.ViewContainer;
import com.d954mas.android.template.debug.impl.BlockCanaryProxyImpl;
import com.d954mas.android.template.debug.impl.DevMetricsProxyImpl;
import com.d954mas.android.template.debug.impl.LeakCanaryProxyImpl;
import com.d954mas.android.template.debug.impl.LynxProxyImpl;
import com.d954mas.android.template.debug.impl.StethoProxyImpl;
import com.d954mas.android.template.debug.impl.ViewContainerImpl;

import javax.annotation.Nonnull;


public class DebugDeveloperModule extends DeveloperModule {
    @Override
    protected DevMetricsProxy provideDevMetricsProxy(@NonNull Application application) {
        return new DevMetricsProxyImpl(application);
    }

    @Override
    protected LeakCanaryProxy provideLeakCanaryProxy(@NonNull Application app) {
        return new LeakCanaryProxyImpl(app);
    }

    @Override
    protected StethoProxy provideStethoProxy(@NonNull Application app) {
        return new StethoProxyImpl(app);
    }

    @Override
    protected ViewContainer provideViewContainer() {
        return new ViewContainerImpl();
    }

    @Override
    protected BlockCanaryProxy provideBlockCanaryProxy(@Nonnull Application app) {
        return new BlockCanaryProxyImpl(app);
    }

    @Override
    protected LynxProxy provideLynxProxy(@NonNull Application app) {
        return new LynxProxyImpl(app);
    }

}
