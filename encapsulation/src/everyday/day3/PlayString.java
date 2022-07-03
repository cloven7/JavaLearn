package everyday.day3;

import java.nio.charset.Charset;

/**
 * @Description 玩一下 String 类
 * @Author clovenine
 * @Date 2022/7/3 21:25
 */
public class PlayString {
    public static void main(String[] args){

        /*
        String 构造方法
         */
        String s1 = "abc";

        String s2 = new String("abc");

        char[] value1 = {'a', 'b', '1', '2', '3'};
        String s3 = new String(value1);

        byte[] bytes = {97, 98, 99, 100, 101, 102, 103};
        String s4 = new String(bytes);

        String s5 = new String(bytes, 2, 3, Charset.defaultCharset());// <Charset...> -> UTF-8

        /*
        String 内存分析和笔试题
         */


    }
}
