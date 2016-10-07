package com.d954mas.android.template.dagger.singleton.components;

import com.d954mas.android.template.dagger.singleton.modules.AppModule;
import com.d954mas.android.template.debug.dagger.modules.DebugDeveloperModule;
import com.d954mas.android.template.debug.impl.ViewContainerImpl;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DebugDeveloperModule.class})
interface DebugAppComponent extends AppComponent {
    void inject(ViewContainerImpl viewContainer);
}
