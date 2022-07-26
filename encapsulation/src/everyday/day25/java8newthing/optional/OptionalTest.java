package everyday.day25.java8newthing.optional;


import everyday.day6.strategy.User;

import java.util.Optional;
import java.util.Scanner;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 16:07
 * @Version 1.0
 */
public class OptionalTest {

	public static void main(String[] args) {
		Optional<String> optional = Optional.of("abac");

			User user = new User("chen", 111, 1.0);
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		if(i == 0){
			user = null;
		}
		//
		Optional<User> optional1 = Optional.ofNullable(user);
//		optional1.ifPresent(System.out::println);

		optional1.orElseGet(() -> {
			return new User();
		});

		//
		User user1 = optional1.orElseGet(User::new);
		System.out.println("user1 = " + user1);

		//


	}

}
