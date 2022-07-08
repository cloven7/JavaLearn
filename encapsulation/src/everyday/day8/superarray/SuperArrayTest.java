package everyday.day8.superarray;

/**
 * @Description 做了超级数组和超级链表的泛型
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 15:53
 * @Version 1.0
 */
public class SuperArrayTest {

	public static void main(String[] args) {
		SuperArray<Student> superArray = new SuperArray<>();
//		superArray.addToHeader("adasdf");
		superArray.addToHeader(new Student("zs", 21));
		superArray.addToHeader(new Student("lisi", 21));
		superArray.addToHeader(new Student("wangwu", 21));
		superArray.addToHeader(new Student("juliu", 21));

		System.out.println("superArray.toString() = " + superArray.arrayToString());
		for(int i = 0; i < superArray.getSize(); i++){
			((Student)superArray.select(i)).play();
		}

		Super<Student> studentSuper = new SuperArray<>(); // 超级数组的泛型
		studentSuper.addToTail(new Student("zs", 21));
		studentSuper.addToTail(new Student("zs", 21));
		studentSuper.addToTail(new Student("zs", 21));
		studentSuper.addToTail(new Student("zs", 21));
		studentSuper.addToTail(new Student("zs", 21));


		Super<Student> studentSuper1 = new SuperLink<>(); // 超级链表的泛型
		for (int i = 0; i < studentSuper.getSize(); i++) {
			studentSuper1.addToTail((Student) studentSuper.select(i));
		}
		System.out.println("-------------------------------------");
		for (int i = 0; i < studentSuper1.getSize(); i++) {

		}
		System.out.println("studentSuper1.arrayToString() = " + studentSuper1.arrayToString());

	}

}
