package everyday.day7.api;

import java.util.Date;

/**
 * @Description 时间戳，掌握和具体时间的相互转换
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/7 16:09
 * @Version 1.0
 */
public class Time {

    public static void compareTime() throws InterruptedException {
        Date date = new Date();
        Thread.sleep(100);
        Date date1 = new Date();
        System.out.println("date.getTime() = " + date.getTime());
        System.out.println("date1.getTime() = " + date1.getTime());
        System.out.println("date.after(date1) = " + date.before(date1));
    }


    public static void main(String[] args) throws InterruptedException {

        /*// 获取现在时间的时间戳
        System.out.println(System.currentTimeMillis());
        System.out.println("new Date().getTime() = " + new Date());
        long a = 1657181850500L;
        System.out.println("new Date().getTime() = " + new Date(a));*/
        /*Time.compareTime();*/
        long currentTime = System.currentTimeMillis();
        currentTime += 7 * 24 * 60 * 60 * 1000;
        Date date = new Date(currentTime);
        System.out.println("date = " + date);
    }

}
