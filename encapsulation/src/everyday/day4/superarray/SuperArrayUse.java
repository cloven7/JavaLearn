package everyday.day4.superarray;

/**
 * @Description 使用超级数组
 * @Author clovenine
 * @Date 2022/7/4 9:43
 */
public class SuperArrayUse {

    public static void main(String[] args){

        SuperArray superArray = new SuperArray();
        // 尾插 十万数据 7868ms
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            superArray.addToTail(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        // 头插 十万数据 3ms
        start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            superArray.addToHeader(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);


//        System.out.println(superArray.arrayToString());
//        superArray.sort();
//        System.out.println(superArray.arrayToString());

    }

}
