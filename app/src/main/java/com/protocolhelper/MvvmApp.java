package com.protocolhelper;

import android.app.Activity;
import android.app.Application;
import com.protocolhelper.di.component.DaggerAppComponent;
import javax.inject.Inject;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
//import com.teamnety.android.utils.AppLogger;

public class MvvmApp extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

//    @Inject
//    CalligraphyConfig mCalligraphyConfig;

//    @Inject
//    Gson gson;

//    @Inject
//    PreferencesHelper mPreferencesHelper;

//    @Inject
//    ApiHeader mApiHeader;

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this);

//        AppLogger.init();

//        OkHttpClient okHttpClient = new OkHttpClient()
//                .newBuilder()
//                .authenticator(new TokenAuthenticator(mPreferencesHelper, mApiHeader))
//                .build();
//
//        AndroidNetworking.initialize(getApplicationContext(), okHttpClient);
//        AndroidNetworking.setParserFactory(new GsonParserFactory(gson));
//
//        if (BuildConfig.DEBUG) {
//            AndroidNetworking.enableLogging(HttpLoggingInterceptor.Level.BODY);
//        }
//        CalligraphyConfig.initDefault(mCalligraphyConfig);
    }
}
