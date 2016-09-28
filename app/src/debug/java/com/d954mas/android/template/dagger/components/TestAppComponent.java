package com.d954mas.android.template.dagger.components;

import com.d954mas.android.template.dagger.modules.AppModule;
import com.d954mas.android.template.developer_settings.dagger.modules.DebugDeveloperModule;
import com.d954mas.android.template.developer_settings.iface.DevMetricsProxy;
import com.d954mas.android.template.developer_settings.iface.LeakCanaryProxy;
import com.d954mas.android.template.developer_settings.iface.StethoProxy;
import com.d954mas.android.template.ui.activities.BaseActivity;
import com.d954mas.android.template.ui.activities.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DebugDeveloperModule.class})
public interface TestAppComponent extends AppComponent {
}
