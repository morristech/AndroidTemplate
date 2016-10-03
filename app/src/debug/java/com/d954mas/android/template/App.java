package com.d954mas.android.template;


import android.support.annotation.NonNull;

import com.d954mas.android.template.dagger.singleton.components.AppComponent;
import com.d954mas.android.template.dagger.singleton.components.DaggerTestAppComponent;
import com.d954mas.android.template.dagger.singleton.modules.AppModule;
import com.d954mas.android.template.developer_settings.dagger.modules.DebugDeveloperModule;

public class App extends BaseApp {
    @Override @NonNull
    protected AppComponent initAppComponent() {
        return DaggerTestAppComponent.builder()
                .debugDeveloperModule(new DebugDeveloperModule())
                .appModule(new AppModule(this))
                .build();
    }

}
