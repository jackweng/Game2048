package com.jackweng.game2048.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class CacheUtils {

    private Context mContext;
    private String CONFIG = "game2048";
    private SharedPreferences mSP;

    public CacheUtils(Context context) {
        mContext = context;
    }

    private void initSP() {
        if (mSP == null)
            mSP = mContext.getSharedPreferences(CONFIG, Activity.MODE_PRIVATE);
    }

    public void putInt(String key, int value) {
        initSP();
        Editor editor = mSP.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public int getInt(String key, int def) {
        initSP();
        return mSP.getInt(key, def);
    }

    public void putString(String key, String value) {
        initSP();
        Editor editor = mSP.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public String getString(String key, String defvalue) {
        initSP();
        return mSP.getString(key, defvalue);
    }
}
