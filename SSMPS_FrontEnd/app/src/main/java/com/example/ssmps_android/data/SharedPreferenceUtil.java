package com.example.ssmps_android.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceUtil {
    private static final String NAME = "ssmps_manager_token";
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public SharedPreferenceUtil(Context context) {
        sharedPreferences = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void putData(String key, Object object){
        editor.putString(key, ((String) object));
    }

    public void remove(String key){
        editor.remove(key);
    }

    public String getData(String key, String defaultValue){
        return sharedPreferences.getString(key, defaultValue);
    }

    public int getData(String key, int defaultValue){
        return sharedPreferences.getInt(key, defaultValue);
    }
}