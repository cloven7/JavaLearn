package everyday.day4.superlink;

/**
 * @Description 超级链表的使用
 * @Author clovenine
 * @Date 2022/7/4 14:41
 */
public class SuperLinkUse {

    public static void main(String[] args){
        SuperLink superLink = new SuperLink();
        // 尾插 十万数据 7868ms
/*        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            superLink.addToTail(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);*/

        // 头插 十万数据 3ms
/*        start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            superLink.addToHeader(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);*/

        for(int i = 0; i < 1000; i++){
            superLink.addToHeader((int)(Math.random() * 100));
        }
//        System.out.println(superLink.arrayToString());
        // 记录排序时间
        long start = System.currentTimeMillis();
        superLink.sort2();
        long end = System.currentTimeMillis();
        System.out.println(end - start);

//        System.out.println(superLink.arrayToString());

        //System.out.println(superLink.arrayToString());

    }

}
