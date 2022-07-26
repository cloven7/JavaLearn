package everyday.day25.java8newthing.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
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
		personList.add(new Person("张三", 3001, 23, "男", "北京"));
		personList.add(new Person("1张三", 3005, 123, "男", "北京"));
		personList.add(new Person("2张三", 8002, 223, "男", "北京"));
		personList.add(new Person("3张三", 3007, 323, "女", "北京"));
		personList.add(new Person("4张三", 3003, 423, "女", "北京"));
		personList.add(new Person("5张三", 3004, 523, "男", "北京"));
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

	@Test // 规约reduce，将多个数的结果规约到一个
	public void reduceTest(){
		// 1为初始值，n1 为当前结果，n2为当前值
		// 累乘
		int reduce = IntStream.of(2, 3, 4, 1).reduce(1, (n1, n2) -> n1 * n2);
		System.out.println("reduce = " + reduce);
		// 求和
		int reduce1 = IntStream.of(2, 3, 4, 1).reduce(0, (n1, n2) -> n1 + n2);
		System.out.println("reduce1 = " + reduce1);
	}

	@Test // 拼接joining
	public void joiningTest(){
		List<String> list = Arrays.asList("AS", "BS", "CS");
		String string = list.stream().collect(Collectors.joining("-", "*", "#"));

		System.out.println("string = " + string);
	}

	@Test // 分组(partitioningBy / groupingBy) 分区：将stream按条件分为两个Map，比如员工按薪资是否高于5000分为两部分
	// 分组：将集合分为多个Map，比如员工按性别分组
	public void partitioningByTest(){
		Map<Boolean, List<Person>> collect = personList.stream().collect(Collectors.partitioningBy(p -> p.getSalary() > 5000));
		System.out.println("collect = " + collect);

		Map<String, List<Person>> collect1 = personList.stream().collect(Collectors.groupingBy(p -> p.getSex()));
		Map<String, List<Person>> collect2 = personList.stream().collect(Collectors.groupingBy(Person::getSex));
		System.out.println("collect1 = " + collect1.get("女"));


	}

	@Test // 归集 :: 将流归集成集合、Map等
	public void collectTest(){
		List<Integer> collect = simpleList.stream().collect(Collectors.toList());
		Set<Integer> collect2 = simpleList.stream().collect(Collectors.toSet());
		Map<String, Person> collect3 = personList.stream().collect(Collectors.toMap(person -> person.getName(), person -> person)); // 归集成Map需要处理Key和Value
		System.out.println("collect3 = " + collect3);
	}


	// 中间操作：filter 过滤， map 映射 sorted
	@Test
	public void filterTest(){
		personList.stream().filter(p -> p.getSalary() > 5000)
				.forEach(System.out::println);
		List<Person> collect = personList.stream().filter(p -> p.getSalary() > 5000)
				.collect(Collectors.toList());
		System.out.println("collect = " + collect);
	}

	@Test // map 映射
	public void mapTest(){
		// 拿到每个员工的工资
		List<Integer> collect = personList.stream().map(p -> p.getSalary()).collect(Collectors.toList());
		System.out.println("collect = " + collect);

		List<Integer> collect1 = personList.stream().map(p -> {
			p.setSalary(p.getSalary() + 1000);
			return p.getSalary();
		}).collect(Collectors.toList());
		System.out.println("collect1 = " + collect1);
	}

	@Test //sorted 排序
	public void sortTest(){
		//
		personList.stream().sorted((p1, p2) -> p1.getSalary() - p2.getSalary())
				.forEach(System.out::println);

		personList.stream().sorted(Comparator.comparingInt(Person::getSalary))
				.forEach(System.out::println);
	}

	@Test // peek 在Stream中间进行调试，因为stream不支持debug
	public void peekTest(){
		// peek
		personList.stream().filter(p -> p.getSalary() > 3003)
				.peek(System.out::println).collect(Collectors.toList());

		// 修改元素信息 给员工工资涨100
		personList.stream().peek(p -> p.setSalary(p.getSalary() + 100)).forEach(System.out::println);
	}

	// 流的其它操作，合并、去重、限制、跳过等操作
	@Test
	public void otherTest(){
		// distinct去掉重复数据
		// skip跳过几个数据
		// limit限制使用几个数据

		simpleList.stream().distinct().skip(2).limit(3).forEach(System.out::println);

		// limit
		// 取工资前三名的员工
		personList.stream().sorted((p1, p2) -> p2.getSalary() - p1.getSalary())
				.limit(3).forEach(System.out::println);

		// distinct 去重 skip 跳过前几个
		IntStream.of(1, 2, 2, 2, 2, 22, 3, 4, 3, 3, 3, 3, 4, 4, 7, 23, 234, 1).distinct().skip(2).forEach(System.out::println);


		// 找到男员工和女员工中工资最高的人
		Map<String, Integer> map = new HashMap<>(2);
		Map<String, List<Person>> collect = personList.stream().collect(Collectors.groupingBy(Person::getSex));

		for(Map.Entry<String, List<Person>> entry : collect.entrySet()){
			String key = entry.getKey();
			Integer salary = entry.getValue().stream().mapToInt(Person::getSalary)
					.max().orElse(0);
			map.put(key, salary);
		}
		System.out.println("map = " + map);


		List<Person> lists = collect.get("男");
		System.out.println("lists = " + lists);


	}

}
