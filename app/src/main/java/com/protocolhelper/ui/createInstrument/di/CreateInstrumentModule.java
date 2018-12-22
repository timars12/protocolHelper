package com.protocolhelper.ui.createInstrument.di;

import com.protocolhelper.data.local.InstrumentLocalStorage;
import com.protocolhelper.ui.createInstrument.viewmodel.CreateInstrumentViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class CreateInstrumentModule {

    @Provides
    CreateInstrumentViewModel provideCreateInstrumentViewModel(InstrumentLocalStorage instrumentLocalStorage) {
        return new CreateInstrumentViewModel(instrumentLocalStorage);
    }

}
