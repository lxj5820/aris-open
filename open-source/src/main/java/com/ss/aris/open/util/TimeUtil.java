package com.ss.aris.open.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeUtil {

    public static String getDateTime(long ms){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(ms));
    }

    public static String getTimeWithSecond(){
        return new SimpleDateFormat("hh:mm:ss").format(new Date());
    }

    /**
     *
     * @return {time, week, day}
     */
    public static String[] getTime(){
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int week = cal.get(Calendar.DAY_OF_WEEK);
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        String time = sdf.format(cal.getTime());

        return new String[]{time, WEEKs[week], getDay(day, month)};
    }

    protected static final String[] WEEKs = {"", "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
    protected static final String[] MONTHs = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October",
            "November", "December"};

    protected static String getDay(int day, int month){
        String str = "";
        str += MONTHs[month] + " ";
        if(day < 10){
            str += "0";
        }
        str += day;
        return str;
    }


}
