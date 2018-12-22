package com.protocolhelper.di.builder;

import com.protocolhelper.ui.createInstrument.CreateInstrumentActivity;
import com.protocolhelper.ui.createInstrument.di.CreateInstrumentModule;
import com.protocolhelper.ui.main.MainActivity;
import com.protocolhelper.ui.main.di.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity homeActivity();

    @ContributesAndroidInjector(modules = CreateInstrumentModule.class)
    abstract CreateInstrumentActivity createInstrumentActivity();
}
