package com.d954mas.android.template.dagger.modules;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @NonNull
    private final Application application;

    public AppModule(@NonNull Application application) {
        this.application = application;
    }

    @Provides @Singleton
    Application providesApplication() {
        return application;
    }

    @Provides @NonNull @Singleton
    Context providesContext() {
        return application;
    }

}
