package com.lin.commonspring.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class TimeUtils {

    public static long WEEK_MILLIS = (long) 1000 * 60 * 60 * 24 * 7;
    private static SimpleDateFormat minuteFormat = new SimpleDateFormat("yyyyMMddHHmm");
    private static SimpleDateFormat dayFormat = new SimpleDateFormat("yyyyMMdd");
    private static SimpleDateFormat dayFormatWithBar = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat secondFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    // 日期处理
    public static Calendar getNow() {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.setTimeInMillis(System.currentTimeMillis());
        return calendar;
    }

    public static Calendar getToday() {
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c;
    }

    public static Calendar getYesterday() {
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        c.add(Calendar.DATE, -1);
        return c;
    }
    
    public static Calendar getTomorrow() {
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        c.add(Calendar.DATE, 1);
        return c;
    }
    
    public static Calendar getDayAgo(int num){
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        c.add(Calendar.DATE, -num);
        return c;
    }


    public static Calendar getWeekMonday() {
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        while (c.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
            c.add(Calendar.DATE, -1);
        }
        return c;
    }

    public static Calendar getWeekMonday(long timestamp) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(timestamp);
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        while (c.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
            c.add(Calendar.DATE, -1);
        }
        return c;
    }

    public static Calendar getPrevWeekMonday() {
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        c.add(Calendar.DATE, -7);
        while (c.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
            c.add(Calendar.DATE, -1);
        }
        return c;
    }

    public static Calendar getNextWeekMonday() {
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        c.add(Calendar.DATE, 7);
        while (c.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
            c.add(Calendar.DATE, -1);
        }
        return c;
    }
    
    public static Calendar getLastTenMinute(){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MINUTE, -10);
        int minute = c.get(Calendar.MINUTE);
        int mod = minute % 10;
        c.add(Calendar.MINUTE, -mod);
        c.set(Calendar.MILLISECOND, 0);
        return c;
    }
    
    public static Calendar getNextTenMinute(){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MINUTE, 10);
        int minute = c.get(Calendar.MINUTE);
        int mod = minute % 10;
        c.add(Calendar.MINUTE, -mod);
        c.set(Calendar.MILLISECOND, 0);
        return c;
    }
    
    public static Calendar getCurrentTenMinute(){
        Calendar c = Calendar.getInstance();
        int minute = c.get(Calendar.MINUTE);
        int mod = minute % 10;
        c.add(Calendar.MINUTE, -mod);
        c.set(Calendar.MILLISECOND, 0);
        return c;
    }

    public static Calendar dayOf(Timestamp timestamp) {
        Calendar c = Calendar.getInstance();
        c.setTime(timestamp);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c;
    }

    public static ArrayList<String> getWeekMondayStrings(int count, int gap) {
        Calendar to = getWeekMonday();
        Calendar from = (Calendar) to.clone();
        from.add(Calendar.WEEK_OF_YEAR, -gap);
        ArrayList<String> ret = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        // 一共不到n周，返回一个当前的数据
        // 如果没有一周的数据，则不返回
        if (count <= 0) {
            from.add(Calendar.WEEK_OF_YEAR, -count + 1);
            if (!from.after(to)) {
                ret.add(format.format(from.getTime()) + " - " + format.format(to.getTime()));
            }
        } else {
            for (int i = 0; i < count; ++i) {
                ret.add(format.format(from.getTime()) + " - " + format.format(to.getTime()));
                from.add(Calendar.WEEK_OF_YEAR, -1);
                to.add(Calendar.WEEK_OF_YEAR, -1);
            }
        }

        return ret;
    }

    public static long getMinuteTimestamp(long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }

    public static int getWeeksCount(Timestamp createTime) {
        return (int) ((getWeekMonday().getTimeInMillis() - getWeekMonday(createTime.getTime()).getTimeInMillis()) / WEEK_MILLIS);
    }

    public static String getFFMpegString(int milliseconds) {
        int milli = milliseconds % 1000;
        int second = milliseconds / 1000 % 60;
        int minute = milliseconds / 60000;
        return String.format("%02d:%02d.%03d", minute, second, milli);
    }
    
    public static String getMinuteKey(Date date){
        return minuteFormat.format(date);
    }
    
    public static String getDayKey(Date date){
        return dayFormat.format(date);
    }

    public static String getDayKeyWithBar(Date date){
        return dayFormatWithBar.format(date);
    }

    public static String getTimeStr(Date date) {
        return secondFormat.format(date);
    }

}
