package com.protocolhelper.ui.createInstrument;

import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.android.databinding.library.baseAdapters.BR;
import com.protocolhelper.R;
import com.protocolhelper.databinding.ActivityCreateInstrumentBinding;
import com.protocolhelper.ui.base.BaseActivity;
import com.protocolhelper.ui.createInstrument.viewmodel.CreateInstrumentViewModel;

import javax.inject.Inject;

public class CreateInstrumentActivity extends BaseActivity<ActivityCreateInstrumentBinding, CreateInstrumentViewModel> {
    @Inject
    CreateInstrumentViewModel viewModel;

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_create_instrument;
    }

    @Override
    public CreateInstrumentViewModel getViewModel() {
        return viewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityCreateInstrumentBinding mBinding = getViewDataBinding();

        Toolbar toolbar = mBinding.toolbar;
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        assert supportActionBar != null;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        supportActionBar.setDisplayShowHomeEnabled(true);
    }

    /**
     * Initialize the contents of the Activity's standard options menu. You should place your menu items in to menu.
     *
     * @param menu     The options menu in which you place your items.
     */
    @MainThread
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_for_create_instrument, menu);
        return true;
    }

    /**
     * Called whenever an item in options menu is selected.
     * We can open either search fragment or info fragment(not implemented)
     *
     * @param item The menu item that was selected.
     * @return whether or not event was consumed, if true event was consumed here, false - can be consumed in another place or not consumed at all
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        viewModel.saveInstrument();
        return super.onOptionsItemSelected(item);
    }
}
