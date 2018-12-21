package com.protocolhelper.ui.createInstrument.viewmodel;

import com.protocolhelper.data.local.InstrumentLocalStorage;
import com.protocolhelper.ui.base.BaseViewModel;

import javax.inject.Inject;

public class CreateInstrumentViewModel extends BaseViewModel {

    @Inject
    public CreateInstrumentViewModel(InstrumentLocalStorage instrumentLocalStorage){
        instrumentLocalStorage.saveInstrument(null);
    }
}
