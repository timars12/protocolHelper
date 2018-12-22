package com.protocolhelper.ui.main.viewmodel;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.util.Log;

import com.protocolhelper.data.local.InstrumentLocalStorage;
import com.protocolhelper.ui.base.BaseViewModel;

import javax.inject.Inject;

public class MainViewModel extends BaseViewModel {

    public ObservableField<String> item = new ObservableField<>("test12");
    public ObservableBoolean isOpenCreateInstrument = new ObservableBoolean(false);

    @Inject
    public MainViewModel(InstrumentLocalStorage instrumentLocalStorage){
//        instrumentLocalStorage.saveInstrument(null);
    }

    public void createInstrument(){
        isOpenCreateInstrument.set(true);
    }
}
