package com.d954mas.android.template.developer_settings.dagger.modules;

import android.app.Application;
import android.support.annotation.NonNull;

import com.d954mas.android.template.developer_settings.developer_settings.BlockCanaryProxyImpl;
import com.d954mas.android.template.developer_settings.developer_settings.DevMetricsProxyImpl;
import com.d954mas.android.template.developer_settings.developer_settings.LeakCanaryProxyImpl;
import com.d954mas.android.template.developer_settings.developer_settings.StethoProxyImpl;
import com.d954mas.android.template.developer_settings.developer_settings.ViewContainerImpl;
import com.d954mas.android.template.developer_settings.iface.BlockCanaryProxy;
import com.d954mas.android.template.developer_settings.iface.DevMetricsProxy;
import com.d954mas.android.template.developer_settings.iface.LeakCanaryProxy;
import com.d954mas.android.template.developer_settings.iface.StethoProxy;
import com.d954mas.android.template.developer_settings.iface.ViewContainer;

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
}
