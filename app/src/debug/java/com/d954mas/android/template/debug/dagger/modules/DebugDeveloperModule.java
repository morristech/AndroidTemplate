package com.d954mas.android.template.debug.dagger.modules;

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
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class DebugDeveloperModule {
    @Provides @Singleton
    DevMetricsProxy provideDevMetricsProxy(@NonNull Application application) {
        return new DevMetricsProxyImpl(application);
    }

    @Provides @Singleton
    LeakCanaryProxy provideLeakCanaryProxy(@NonNull Application app) {
        return new LeakCanaryProxyImpl(app);
    }

    @Provides @Singleton
    StethoProxy provideStethoProxy(@NonNull Application app) {
        return new StethoProxyImpl(app);
    }

    @Provides @Singleton
    ViewContainer provideViewContainer() {
        return new ViewContainerImpl();
    }

    @Provides @Singleton
    BlockCanaryProxy provideBlockCanaryProxy(@Nonnull Application app) {
        return new BlockCanaryProxyImpl(app);
    }

    @Provides @Singleton
    LynxProxy proviseLynxProxy(@NonNull Application app) {
        return new LynxProxyImpl(app);
    }

}
