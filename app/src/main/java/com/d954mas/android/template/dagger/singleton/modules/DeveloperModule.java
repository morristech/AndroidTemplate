package com.d954mas.android.template.dagger.singleton.modules;

import com.d954mas.android.template.debug.iface.BlockCanaryProxy;
import com.d954mas.android.template.debug.iface.DevMetricsProxy;
import com.d954mas.android.template.debug.iface.LeakCanaryProxy;
import com.d954mas.android.template.debug.iface.StethoProxy;
import com.d954mas.android.template.debug.iface.TinyDancerProxy;
import com.d954mas.android.template.debug.iface.ViewContainer;
import com.d954mas.android.template.debug.impl.EmptyBlockCanary;
import com.d954mas.android.template.debug.impl.EmptyDevMetricsProxy;
import com.d954mas.android.template.debug.impl.EmptyLeakCanaryProxy;
import com.d954mas.android.template.debug.impl.EmptyStethoProxy;
import com.d954mas.android.template.debug.impl.EmptyTinyDancerProxy;
import com.d954mas.android.template.debug.impl.EmptyViewContainer;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DeveloperModule {
    @Provides @Singleton
    DevMetricsProxy provideDevMetricsProxy() {
        return new EmptyDevMetricsProxy();
    }

    @Provides @Singleton
    LeakCanaryProxy provideLeakCanaryProxy() {
        return new EmptyLeakCanaryProxy();
    }

    @Provides @Singleton
    StethoProxy provideStethoProxy() {
        return new EmptyStethoProxy();
    }

    @Provides @Singleton
    ViewContainer provideViewContainer() {
        return new EmptyViewContainer();
    }

    @Provides @Singleton
    BlockCanaryProxy provideBlockCanaryProxy() {
        return new EmptyBlockCanary();
    }

    @Provides @Singleton
    TinyDancerProxy provideTinyDancerProxy() {
        return new EmptyTinyDancerProxy();
    }


}
