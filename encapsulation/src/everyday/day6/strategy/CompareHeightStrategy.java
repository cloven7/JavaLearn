package everyday.day6.strategy;

/**
 * @Description 策略设计模式
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/6 14:45
 * @Version 1.0
 */
public class CompareHeightStrategy implements Comparator{

    public Integer compare(User user, User user1) {
        return (int)(user.getHeight() - user1.getHeight());
    }
}
