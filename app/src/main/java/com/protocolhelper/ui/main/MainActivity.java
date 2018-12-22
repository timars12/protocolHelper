package com.protocolhelper.ui.main;

import android.content.Intent;
import android.databinding.Observable;
import android.os.Bundle;

import com.android.databinding.library.baseAdapters.BR;
import com.protocolhelper.R;
import com.protocolhelper.ui.base.BaseActivity;
import com.protocolhelper.ui.base.BaseViewModel;
import com.protocolhelper.ui.createInstrument.CreateInstrumentActivity;
import com.protocolhelper.ui.main.viewmodel.MainViewModel;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    MainViewModel viewModel;

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public BaseViewModel getViewModel() {
        return viewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intentCreateInstrument = new Intent(this, CreateInstrumentActivity.class);

        viewModel.isOpenCreateInstrument.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                if(viewModel.isOpenCreateInstrument.get()){
                    startActivity(intentCreateInstrument);
                    viewModel.isOpenCreateInstrument.set(false);
                }
            }
        });

    }

}
