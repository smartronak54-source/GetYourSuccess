package com.getyoursuccess.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Shared Preferences Helper for storing user preferences
 */
public class PreferencesHelper {

    private static final String PREF_NAME = "GetYourSuccess_Prefs";
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public PreferencesHelper(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void setUserLoggedIn(boolean isLoggedIn) {
        editor.putBoolean("isLoggedIn", isLoggedIn).apply();
    }

    public boolean isUserLoggedIn() {
        return sharedPreferences.getBoolean("isLoggedIn", false);
    }

    public void setUserId(String userId) {
        editor.putString("userId", userId).apply();
    }

    public String getUserId() {
        return sharedPreferences.getString("userId", null);
    }

    public void setLockdownEnabled(boolean enabled) {
        editor.putBoolean("lockdownEnabled", enabled).apply();
    }

    public boolean isLockdownEnabled() {
        return sharedPreferences.getBoolean("lockdownEnabled", false);
    }

    public void setStudyModeActive(boolean active) {
        editor.putBoolean("studyModeActive", active).apply();
    }

    public boolean isStudyModeActive() {
        return sharedPreferences.getBoolean("studyModeActive", false);
    }

    public void clear() {
        editor.clear().apply();
    }
}
