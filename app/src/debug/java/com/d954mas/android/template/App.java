package com.d954mas.android.template;


import android.support.annotation.NonNull;

import com.d954mas.android.template.dagger.singleton.modules.AppModule;
import com.d954mas.android.template.singleton.components.AppComponent;
import com.d954mas.android.template.singleton.components.DaggerDebugAppComponent;
import com.d954mas.android.template.singleton.modules.DebugDeveloperModule;

public class App extends BaseApp {
    @Override @NonNull
    protected AppComponent initAppComponent() {
        return DaggerDebugAppComponent.builder()
                .debugDeveloperModule(new DebugDeveloperModule())
                .appModule(new AppModule(this))
                .build();
    }

}
