package com.d954mas.android.template;


import android.support.annotation.NonNull;

import com.d954mas.android.template.dagger.singleton.components.AppComponent;
import com.d954mas.android.template.dagger.singleton.components.DaggerDebugAppComponent;
import com.d954mas.android.template.dagger.singleton.modules.AppModule;
import com.d954mas.android.template.dagger.singleton.modules.DebugDeveloperModule;
import com.d954mas.android.template.dagger.singleton.modules.DebugNetModule;


public class App extends BaseApp {
    @Override @NonNull
    protected AppComponent initAppComponent() {
        return DaggerDebugAppComponent.builder()
                .appModule(new AppModule(this))
                .developerModule(new DebugDeveloperModule())
                .netModule(new DebugNetModule())
                .build();
    }

}
