package everyday.day7.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description 日期格式化
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/7 18:13
 * @Version 1.0
 */
public class Format {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String format = simpleDateFormat.format(date); // 格式化日期
        System.out.println("format = " + format);

        Date parse = simpleDateFormat.parse("2022/8/7 下午3:14");
        System.out.println("parse = " + parse); // 反过来

        // DIY自己喜欢的日期格式
        simpleDateFormat.applyPattern("yyyy'年'-MM'月'-dd'日'hh:mm:ss.SSSZ");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
        String format1 = simpleDateFormat.format(date); // 格式化日期
        System.out.println("format = " + format1);

        System.out.println("DateUtil.now() = " + DateUtil.now());
        System.out.println("DateUtil.nowString() = " + DateUtil.nowString());

    }
}
