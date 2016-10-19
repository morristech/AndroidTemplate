package com.d954mas.android.template.singleton.components;

import com.d954mas.android.template.dagger.singleton.modules.AppModule;
import com.d954mas.android.template.debug.fragments.LynxDebugFragment;
import com.d954mas.android.template.debug.impl.ViewContainerImpl;
import com.d954mas.android.template.singleton.modules.DebugDeveloperModule;
import com.d954mas.android.template.singleton.modules.DebugNetModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DebugNetModule.class, DebugDeveloperModule.class})
interface DebugAppComponent extends AppComponent {
    void inject(ViewContainerImpl viewContainer);

    void inject(LynxDebugFragment fragment);
}
