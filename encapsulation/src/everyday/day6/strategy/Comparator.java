package everyday.day6.strategy;

/**
 * @Description 策略设计模式
 * @Author clovenine
 * @Date 2022/7/6 14:53
 * @Version 2.0 实现箭头函数改造策略
 */

@FunctionalInterface
public interface Comparator {

    public Integer compare(User user, User user1);

}
