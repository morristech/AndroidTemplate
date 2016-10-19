package com.d954mas.android.template.singleton.modules;


import com.facebook.stetho.okhttp3.StethoInterceptor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

@Module
public class DebugNetModule {
    @Provides @Singleton
    OkHttpClient providesOkHttpClient() {
        return new OkHttpClient.Builder().addNetworkInterceptor(new StethoInterceptor()).build();
    }
}
