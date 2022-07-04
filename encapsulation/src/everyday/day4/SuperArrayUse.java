package everyday.day4;

/**
 * @Description 使用超级数组
 * @Author clovenine
 * @Date 2022/7/4 9:43
 */
public class SuperArrayUse {

    public static void main(String[] args){

        SuperArray superArray = new SuperArray(2);
        superArray.add(12);
        superArray.add(234);
        superArray.add(12);
        superArray.add(112);
        superArray.add(12342);
        superArray.add(12);
        superArray.delete(2);
        superArray.set(0, 4);
        System.out.println(superArray.arrayToString());
        superArray.sort();
        System.out.println(superArray.arrayToString());
        for (int i = 0; i < superArray.getSize(); i++) {
            System.out.println(superArray.select(i));
        }
    }

}
