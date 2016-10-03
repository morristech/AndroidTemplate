package com.d954mas.android.template.dagger.singleton.components;

import com.d954mas.android.template.dagger.singleton.modules.AppModule;
import com.d954mas.android.template.dagger.singleton.modules.DeveloperModule;
import com.d954mas.android.template.developer_settings.iface.BlockCanaryProxy;
import com.d954mas.android.template.developer_settings.iface.DevMetricsProxy;
import com.d954mas.android.template.developer_settings.iface.LeakCanaryProxy;
import com.d954mas.android.template.developer_settings.iface.StethoProxy;
import com.d954mas.android.template.ui.activities.BaseActivity;
import com.d954mas.android.template.ui.activities.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DeveloperModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);

    void inject(BaseActivity baseActivity);

    DevMetricsProxy devMetricsProxy();

    LeakCanaryProxy leakCanaryProxy();

    StethoProxy stethoProxy();

    BlockCanaryProxy blockCanaryProxy();
}
