package com.hprj.mybase;

public class MyApplication extends com.haiprj.android_app_lib.MyApplication {
    @Override
    protected boolean isPurchased() {
        return false;
    }

    @Override
    protected boolean isShowAdsTest() {
        return false;
    }

    @Override
    public boolean enableAdsResume() {
        return false;
    }

    @Override
    public String getOpenAppAdId() {
        return null;
    }
}
