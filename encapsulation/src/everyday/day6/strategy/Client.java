package everyday.day6.strategy;

import java.util.Arrays;

/**
 * @Description 策略设计模式
 * @Author clovenine
 * @Date 2022/7/6 14:13
 */
public class Client {

    public static void main(String[] args) {

        User user1 = new User("小王",12,153.4);
        User user2 = new User("小李",14,103.4);
        User user3 = new User("小张",13,123.4);
        User user4 = new User("小杨",4,6.4);

        User[] users = {user1, user2, user3, user4};

        UserSorter userSorter = new UserSorter();
        Comparator comparator = new CompareAgeStrategy();
        //comparator = new CompareHeightStrategy();
        userSorter.sort(users, comparator);

        System.out.println(Arrays.toString(users));

    }

}
