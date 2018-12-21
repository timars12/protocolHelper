package com.protocolhelper.di.module;

import android.app.Application;
import android.content.Context;

import com.protocolhelper.data.local.db.AppDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    AppDatabase provideAppDatabase(String dbName, Context context) {
        return AppDatabase.getInstance(context, dbName);
    }

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    String provideDatabaseName() {
        return "teamnety_mvvm.db";
    }

}
