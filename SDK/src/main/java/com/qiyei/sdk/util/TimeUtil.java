package com.qiyei.sdk.util;

import java.text.SimpleDateFormat;

/**
 * @author Created by qiyei2015 on 2017/10/25.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */
public class TimeUtil {

    public static final String FORMAT_1 = "yyyy-MM-dd HH:mm:ss.SSS";

    /**
     * 格式化时间
     * @param time
     * @param format
     * @return
     */
    public static String formatTime(long time,String format){
        SimpleDateFormat sf = new SimpleDateFormat(format);
        return sf.format(time);
    }

}
