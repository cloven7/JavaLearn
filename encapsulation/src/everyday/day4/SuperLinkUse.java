package everyday.day4;

/**
 * @Description 超级链表的使用
 * @Author clovenine
 * @Date 2022/7/4 14:41
 */
public class SuperLinkUse {

    public static void main(String[] args){
        SuperLink superLink = new SuperLink();
        // 尾插 十万数据 7868ms
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            superLink.addToTail(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        // 头插 十万数据 3ms
        start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            superLink.addToHeader(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);


        //System.out.println(superLink.arrayToString());

    }

}
