package com.d954mas.android.template.dagger.singleton.components;

import com.d954mas.android.template.dagger.singleton.modules.AppModule;
import com.d954mas.android.template.developer_settings.dagger.modules.DebugDeveloperModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DebugDeveloperModule.class})
interface TestAppComponent extends AppComponent {
}
