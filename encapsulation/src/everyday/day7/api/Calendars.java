package everyday.day7.api;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * @Description 日历
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/7 16:39
 * @Version 1.0
 */
public class Calendars {

    public static void main(String[] args) {
        // 创建一个日期类
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+04:00"));//拿到一个时区
        System.out.println("calendar.getTime() = " + calendar.getTime());
        System.out.println("Calendar.HOUR = " + calendar.get(Calendar.HOUR));
        // 拿到月份 月份从0开始
        int i = calendar.get(Calendar.MONTH);
        int ij = calendar.get(Calendar.DATE);
        System.out.println("i = " + ij);

        //
        System.out.println("calendar.getTimeZone() = " + calendar.getTimeZone());


    }

}
