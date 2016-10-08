package com.d954mas.android.template;


import android.support.annotation.NonNull;

import com.d954mas.android.template.dagger.singleton.components.AppComponent;
import com.d954mas.android.template.dagger.singleton.components.DaggerAppComponent;
import com.d954mas.android.template.dagger.singleton.modules.AppModule;
import com.d954mas.android.template.dagger.singleton.modules.DeveloperModule;

public class App extends BaseApp {
    @Override @NonNull
    protected AppComponent initAppComponent() {
        return DaggerAppComponent.builder()
                .developerModule(new DeveloperModule())
                .appModule(new AppModule(this))
                .build();
    }

}
