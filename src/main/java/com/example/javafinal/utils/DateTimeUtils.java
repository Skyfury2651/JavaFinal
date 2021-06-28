package com.example.javafinal.utils;

import java.util.Calendar;

public class DateTimeUtils {
    public static long getCurrentTimeInMLS(){
        return Calendar.getInstance().getTimeInMillis();
    }

    public static long getTimeAfterDays(int day){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, day);

        return calendar.getTimeInMillis();
    }
}
