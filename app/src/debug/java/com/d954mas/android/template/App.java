package com.d954mas.android.template;


import com.d954mas.android.template.dagger.components.AppComponent;
import com.d954mas.android.template.dagger.components.DaggerTestAppComponent;
import com.d954mas.android.template.dagger.modules.AppModule;
import com.d954mas.android.template.developer_settings.dagger.modules.DebugDeveloperModule;

public class App extends BaseApp {
    @Override
    protected AppComponent initAppComponent() {
        return DaggerTestAppComponent.builder()
                .debugDeveloperModule(new DebugDeveloperModule())
                .appModule(new AppModule(this))
                .build();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

}
