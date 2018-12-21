package com.protocolhelper.data.local.impl;

import com.protocolhelper.data.local.InstrumentLocalStorage;
import com.protocolhelper.data.local.db.AppDatabase;
import com.protocolhelper.data.model.Instrument;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class InstrumentLocalImpl implements InstrumentLocalStorage {
    private final AppDatabase mAppDatabase;

    @Inject
    InstrumentLocalImpl(AppDatabase appDatabase) {
        this.mAppDatabase = appDatabase;
    }

    @Override
    public void saveInstrument(Instrument instrument) {
//        Instrument aa = new Instrument();
//
//        mAppDatabase.instrumentDao().insert(aa);
    }
}
