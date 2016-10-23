package com.d954mas.android.template.dagger.singleton.modules;


import android.content.Context;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.io.File;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

@Module
public class NetModule {
    protected static final int CACHE_SIZE = 100 * 1024 * 1024;
    protected static final String PICASSO_CACHE = "picasso-cache";

    @Provides @Singleton
    protected OkHttpClient providesOkHttpClient(Cache cache) {
        return new OkHttpClient.Builder().cache(cache).build();
    }

    @Provides @Singleton
    protected Cache providesCache(Context context) {
        return new Cache(defaultCacheDir(context), CACHE_SIZE);
    }

    private static File defaultCacheDir(Context context) {
        File cache = new File(context.getApplicationContext().getCacheDir(), PICASSO_CACHE);
        if (!cache.exists()) {
            //noinspection ResultOfMethodCallIgnored
            cache.mkdirs();
        }
        return cache;
    }

    @Provides @Singleton
    Picasso providesPicasso(OkHttpClient okHttpClient, Context context) {
        OkHttp3Downloader downloader = new OkHttp3Downloader(okHttpClient);
        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(downloader);
        return builder.build();
    }
}
