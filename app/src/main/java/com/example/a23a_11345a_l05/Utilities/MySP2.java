package com.example.a23a_11345a_l05.Utilities;

import android.content.Context;
import android.content.SharedPreferences;

public class MySP2 {

    private static final String DB_FILE = "DB_FILE";

    private SharedPreferences sharedPreferences;

    public MySP2(Context context) {
        sharedPreferences = context.getSharedPreferences(DB_FILE, Context.MODE_PRIVATE);
    }

    public String getString(String key, String value) {

        return sharedPreferences.getString(key, value);
    }

    public void putString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public int getInt(String key, int value) {
        return sharedPreferences.getInt(key, value);
    }

    public void putInt(String key, int value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }
}
