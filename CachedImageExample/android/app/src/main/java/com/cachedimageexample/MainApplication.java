package com.cachedimageexample;

<<<<<<< ours
import android.util.Log;
import android.app.Application;

import com.facebook.react.ReactApplication;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.facebook.react.ReactInstanceManager;
=======
import android.app.Application;

import com.facebook.react.ReactApplication;
>>>>>>> theirs
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
        @Override
        protected boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        protected String getJSMainModuleName() {
            return "index";
        }

        @Override
        protected List<ReactPackage> getPackages() {
            return Arrays.<ReactPackage>asList(
                    new MainReactPackage(),
                    new RNFetchBlobPackage()
            );
        }
    };

    @Override
<<<<<<< ours
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
=======
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
>>>>>>> theirs
    }

    @Override
    public void onCreate() {
        super.onCreate();
        SoLoader.init(this, /* native exopackage */ false);
    }
}
