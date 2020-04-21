package com.sunday.blog.sundayblog.untils;

import java.text.SimpleDateFormat;

/**
 * @ClassName DateUtils
 * @Description TODO
 * @Author Sunday
 * @Date 2020/4/21 14:05
 * @Version 1.0
 */
public class DateUtils {
    public static String  getSysDate(){
        long millis = System.currentTimeMillis();
        String dateStr = new SimpleDateFormat("YYYY-MM-dd").format(millis);
        return dateStr;
    }
}
