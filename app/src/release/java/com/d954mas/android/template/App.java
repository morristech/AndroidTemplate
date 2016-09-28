package com.d954mas.android.template;


import com.d954mas.android.template.dagger.components.AppComponent;
import com.d954mas.android.template.dagger.components.DaggerAppComponent;
import com.d954mas.android.template.dagger.modules.AppModule;
import com.d954mas.android.template.dagger.modules.DeveloperModule;

public class App extends BaseApp {
    @Override
    protected AppComponent initAppComponent() {
        return DaggerAppComponent.builder()
                .developerModule(new DeveloperModule())
                .appModule(new AppModule(this))
                .build();
    }
}
