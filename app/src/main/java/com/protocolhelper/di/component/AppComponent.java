package com.protocolhelper.di.component;

import android.app.Application;

import com.protocolhelper.MvvmApp;
import com.protocolhelper.di.builder.ActivityBuilder;
import com.protocolhelper.di.module.AppModule;
import com.protocolhelper.di.module.StorageModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        StorageModule.class,
        ActivityBuilder.class})
public interface AppComponent {

    void inject(MvvmApp app);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
