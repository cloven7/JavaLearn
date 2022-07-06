package everyday.day6.strategy;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/6 14:45
 * @Version 1.0
 */
public class CompareAgeStrategy implements Comparator{

    public Integer compare(User user, User user1) {
        return user.getAge() - user1.getAge();
    }
}