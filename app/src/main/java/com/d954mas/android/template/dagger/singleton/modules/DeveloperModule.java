package com.d954mas.android.template.dagger.singleton.modules;

import android.app.Application;
import android.support.annotation.NonNull;

import com.d954mas.android.template.debug.iface.BlockCanaryProxy;
import com.d954mas.android.template.debug.iface.DevMetricsProxy;
import com.d954mas.android.template.debug.iface.LeakCanaryProxy;
import com.d954mas.android.template.debug.iface.LynxProxy;
import com.d954mas.android.template.debug.iface.StethoProxy;
import com.d954mas.android.template.debug.iface.ViewContainer;
import com.d954mas.android.template.debug.impl.EmptyBlockCanary;
import com.d954mas.android.template.debug.impl.EmptyDevMetricsProxy;
import com.d954mas.android.template.debug.impl.EmptyLeakCanaryProxy;
import com.d954mas.android.template.debug.impl.EmptyLynx;
import com.d954mas.android.template.debug.impl.EmptyStethoProxy;
import com.d954mas.android.template.debug.impl.EmptyViewContainer;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DeveloperModule {
    @Provides @Singleton
    protected DevMetricsProxy provideDevMetricsProxy(@NonNull Application application) {
        return new EmptyDevMetricsProxy();
    }

    @Provides @Singleton
    protected LeakCanaryProxy provideLeakCanaryProxy(@NonNull Application application) {
        return new EmptyLeakCanaryProxy();
    }

    @Provides @Singleton
    protected StethoProxy provideStethoProxy(@NonNull Application application) {
        return new EmptyStethoProxy();
    }

    @Provides @Singleton
    protected ViewContainer provideViewContainer() {
        return new EmptyViewContainer();
    }

    @Provides @Singleton
    protected BlockCanaryProxy provideBlockCanaryProxy(@NonNull Application application) {
        return new EmptyBlockCanary();
    }

    @Provides @Singleton
    protected LynxProxy provideLynxProxy(@NonNull Application application) {
        return new EmptyLynx();
    }

}
