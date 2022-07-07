package everyday.day7.api;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/7 18:26
 * @Version 1.0
 */
public class DateUtil {

    public static final String DEFAULT_PATTERN = "yyyy - MM - dd   HH:mm:ss";

    public static Date now(){
        return new Date();
    }

    public static String nowString(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern("yyyy'年'-MM'月'-dd'日'HH时mm分ss秒");
        String format = simpleDateFormat.format(date);
        return format;
    }
    public static String nowString(String pattern){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern(pattern);
        String format = simpleDateFormat.format(date);
        return format;
    }


}
