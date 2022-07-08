package everyday.day8.genericity;

import everyday.day8.superarray.Student;
import everyday.day8.superarray.Super;
import everyday.day8.superarray.SuperArray;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 20:17
 * @Version 1.0
 */
public class Generic {

//	public static void print(Super<?> super1){
//		System.out.println("无界:");
//		System.out.println(super1.arrayToString());
//	};
	public static void print(Super<Student> super1){
		System.out.println("无界:");
		System.out.println(super1.arrayToString());
	};
// 类型擦除，所以会报错
//	public static void print(Super<Integer> super1){
//		System.out.println("无界:");
//		System.out.println(super1.arrayToString());
//	};

	public static void main(String[] args) {
		Super<Student> studentSuper = new SuperArray<>();
		studentSuper.add(new Student("zs", 12));
		studentSuper.add(new Student("ls", 13));
		studentSuper.add(new Student("ww", 14));
		studentSuper.add(new Student("zl", 15));

		print(studentSuper);

//		print(comparable);
	}

}
