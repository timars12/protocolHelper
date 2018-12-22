package com.protocolhelper.ui.createInstrument.viewmodel;

import android.databinding.ObservableField;
import android.util.Log;

import com.protocolhelper.data.local.InstrumentLocalStorage;
import com.protocolhelper.data.model.DescriptionInstrument;
import com.protocolhelper.data.model.Instrument;
import com.protocolhelper.ui.base.BaseViewModel;

import javax.inject.Inject;

public class CreateInstrumentViewModel extends BaseViewModel {

    private InstrumentLocalStorage mLocalStorage;

    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableField<String> methodForSave = new ObservableField<>();
    public final ObservableField<String> estimatedMinimumAmperage = new ObservableField<>();
    public final ObservableField<String> maxResistance = new ObservableField<>();

    @Inject
    public CreateInstrumentViewModel(InstrumentLocalStorage instrumentLocalStorage){
        mLocalStorage = instrumentLocalStorage;
    }

    public void saveInstrument(){
//        if(isValid) todo !!!
        Log.i("123","45600");
        Instrument instrument = new Instrument();
        instrument.name = name.get();
        instrument.instrument = new DescriptionInstrument();
        instrument.instrument.wayOfProtection = methodForSave.get();
        instrument.instrument.estimatedMinimumAmperage = estimatedMinimumAmperage.get();
        instrument.instrument.maxResistance= maxResistance.get();

        mLocalStorage.saveInstrument(instrument);
    }
}
