package everyday.day6.strategy;



/**
 * @Description 策略设计模式
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/6 14:35
 * @Version 1.0
 */
public class UserSorter {

    public void sort(User[] users, Comparator comparator){
        for(int i = 0; i < users.length - 1; i++){
            for(int j = 0; j < users.length - i - 1; j++){
                if(comparator.compare(users[j], users[j + 1]) > 0){
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                }
            }
        }
    }

}
