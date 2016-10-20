package com.d954mas.android.template.dagger.singleton.components;

import com.d954mas.android.template.dagger.singleton.modules.AppModule;
import com.d954mas.android.template.dagger.singleton.modules.DeveloperModule;
import com.d954mas.android.template.dagger.singleton.modules.NetModule;
import com.d954mas.android.template.debug.fragments.LynxDebugFragment;
import com.d954mas.android.template.debug.impl.ViewContainerImpl;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetModule.class, DeveloperModule.class})
interface DebugAppComponent extends AppComponent {
    void inject(ViewContainerImpl viewContainer);
    void inject(LynxDebugFragment fragment);
}
