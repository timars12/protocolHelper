package com.protocolhelper.di.module;

import com.protocolhelper.data.local.InstrumentLocalStorage;
import com.protocolhelper.data.local.impl.InstrumentLocalImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class StorageModule {

    @Provides
    @Singleton
    InstrumentLocalStorage providePostLocalStorage(InstrumentLocalImpl postStorage) {
        return postStorage;
    }
}
