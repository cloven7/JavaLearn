package everyday.day14.collection;

import everyday.day6.strategy.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/14 16:35
 * @Version 1.0
 */
public class MapTest {

	public static void main(String[] args) {
		Map<String, User> map = new HashMap<>();
		User user = new User("chen", 13, 123.0);
		String id = "1234";
		map.put(id, user);
		System.out.println("map.get(id) = " + map.get(id));

	}

}
