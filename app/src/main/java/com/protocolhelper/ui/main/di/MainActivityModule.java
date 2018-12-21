package com.protocolhelper.ui.main.di;

import com.protocolhelper.data.local.InstrumentLocalStorage;
import com.protocolhelper.ui.main.viewmodel.MainViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    MainViewModel provideMainViewViewModel(InstrumentLocalStorage instrumentLocalStorage) {
        return new MainViewModel(instrumentLocalStorage);
    }

}
