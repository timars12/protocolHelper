package com.protocolhelper.ui.createInstrument.di;

import android.arch.lifecycle.ViewModelProvider;

import com.protocolhelper.ViewModelProviderFactory;
import com.protocolhelper.data.local.InstrumentLocalStorage;
import com.protocolhelper.ui.createInstrument.viewmodel.CreateInstrumentViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class CreateInstrumentModule {

//    @Provides
//    CreateInstrumentViewModel provideCreateInstrumentViewModel(InstrumentLocalStorage instrumentLocalStorage) {
//        return new CreateInstrumentViewModel(instrumentLocalStorage);
//    }
//
//    @Provides
//    ViewModelProvider.Factory provideCreateInstrumentViewModel(CreateInstrumentViewModel workspaceViewModel) {
//        return new ViewModelProviderFactory<>(workspaceViewModel);
//    }
}
