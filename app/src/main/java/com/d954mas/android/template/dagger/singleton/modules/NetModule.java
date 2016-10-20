package com.d954mas.android.template.dagger.singleton.modules;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

@Module
public class NetModule {
    @Provides @Singleton
    protected OkHttpClient providesOkHttpClient() {
        return new OkHttpClient();
    }

}
