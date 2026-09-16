package com.getyoursuccess.utils;

import android.content.Context;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Firebase Database Helper
 */
public class FirebaseHelper {

    private static FirebaseHelper instance;
    private DatabaseReference databaseReference;

    private FirebaseHelper() {
        databaseReference = FirebaseDatabase.getInstance().getReference();
    }

    public static synchronized FirebaseHelper getInstance() {
        if (instance == null) {
            instance = new FirebaseHelper();
        }
        return instance;
    }

    public DatabaseReference getUsersRef() {
        return databaseReference.child("users");
    }

    public DatabaseReference getNotesRef() {
        return databaseReference.child("notes");
    }

    public DatabaseReference getTestsRef() {
        return databaseReference.child("tests");
    }

    public DatabaseReference getTestAttemptsRef() {
        return databaseReference.child("test_attempts");
    }

    public DatabaseReference getStudyPlansRef() {
        return databaseReference.child("study_plans");
    }

    public DatabaseReference getPerformanceRef() {
        return databaseReference.child("performance");
    }
}
