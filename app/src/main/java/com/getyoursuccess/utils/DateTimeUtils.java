package com.getyoursuccess.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Date and Time Utility Functions
 */
public class DateTimeUtils {

    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final String DATETIME_FORMAT = "dd/MM/yyyy HH:mm:ss";

    public static String formatDate(long timestamp) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT, Locale.getDefault());
        return sdf.format(new Date(timestamp));
    }

    public static String formatDateTime(long timestamp) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FORMAT, Locale.getDefault());
        return sdf.format(new Date(timestamp));
    }

    public static long getTimestampFromDate(String date) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT, Locale.getDefault());
        return sdf.parse(date).getTime();
    }

    public static int getDaysLeft(long targetDate) {
        long currentTime = System.currentTimeMillis();
        long difference = targetDate - currentTime;
        return (int) (difference / (1000 * 60 * 60 * 24));
    }
}
