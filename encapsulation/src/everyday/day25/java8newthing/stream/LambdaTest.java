package everyday.day25.java8newthing.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/**
 * @Description 终止操作 find - match - foreach
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 16:52
 * @Version 1.0
 */
public class LambdaTest {

	List<Person> personList = new ArrayList<>();
	List<Integer> simpleList = Arrays.asList(15, 22, 9, 11, 33, 52, 14);

	@Before
	public void initData(){
		personList.add(new Person("张三", 3000, 23, "男", "北京"));
		personList.add(new Person("1张三", 3000, 123, "男", "北京"));
		personList.add(new Person("2张三", 8000, 223, "男", "北京"));
		personList.add(new Person("3张三", 3000, 323, "男", "北京"));
		personList.add(new Person("4张三", 3000, 423, "男", "北京"));
		personList.add(new Person("5张三", 3000, 523, "男", "北京"));
	}

	@Test// 消费掉数据 consumer
	public void foreachTest(){
		personList.stream().forEach(System.out::println); // 需要consumer
		personList.stream().forEach(personList -> {
			System.out.println(personList);
		});
//		personList.forEach(System.out::println);
	}

	@Test // 拿到数据 第一个或任意一个
	public void findTest(){
		/*// 单线程版本
		Optional<Person> first = personList.stream().findFirst();
		first = personList.stream().findAny();
		first.ifPresent(System.out::println);*/

		// 改成多线程版本
		Optional<Person> first = personList.parallelStream().findFirst();
		first.ifPresent(System.out::println);

		first = personList.parallelStream().findAny();
		first.ifPresent(System.out::println);
	}

	@Test // 匹配 + 断言可以过滤数据
	public void MatchTest(){
		boolean first = personList.stream().allMatch(p -> p.getSalary() > 3000);
		System.out.println("first = " + first);

		boolean juruo = personList.stream().anyMatch(p -> p.getSalary() > 3000);
		System.out.println("juruo = " + juruo);
	}

	@Test // 统计
	public void countTest(){
		long count = personList.stream().count();
		System.out.println("count = " + count);

		// 统计平均薪资
		OptionalDouble average = simpleList.stream().mapToInt(i -> i).average();
		average.ifPresent(System.out::println);

		// 求和
		int sum = IntStream.of(1, 2, 3, 4, 5).sum();
		System.out.println("sum = " + sum);

		// 求最大值
		OptionalInt max = new Random().ints(10).max();
		max.ifPresent(System.out::println);

		// 匿名内部类
		max.ifPresent(new IntConsumer() {
			@Override
			public void accept(int value) {
				return;
			}
		});

		// 求工资最高的员工的信息
		Optional<Person> max1 = personList.stream().max((o1, o2) -> o1.getSalary() - o2.getSalary());
		Optional<Person> max2 = personList.stream().max(Comparator.comparingInt(Person::getSalary));

		max1.ifPresent(System.out::println);
		max1.ifPresent(person -> System.out.println(person));
	}

}
