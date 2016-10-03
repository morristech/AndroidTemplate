package com.d954mas.android.template.dagger.singleton.modules;

import com.d954mas.android.template.developer_settings.iface.BlockCanaryProxy;
import com.d954mas.android.template.developer_settings.iface.DevMetricsProxy;
import com.d954mas.android.template.developer_settings.iface.LeakCanaryProxy;
import com.d954mas.android.template.developer_settings.iface.StethoProxy;
import com.d954mas.android.template.developer_settings.iface.ViewContainer;
import com.d954mas.android.template.developer_settings.impl.EmptyBlockCanary;
import com.d954mas.android.template.developer_settings.impl.EmptyDevMetricsProxy;
import com.d954mas.android.template.developer_settings.impl.EmptyLeakCanaryProxy;
import com.d954mas.android.template.developer_settings.impl.EmptyStethoProxy;
import com.d954mas.android.template.developer_settings.impl.EmptyViewContainer;

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


}
