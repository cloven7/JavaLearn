package everyday.day8.superarray;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 17:10
 * @Version 1.0
 */
// 2.1子类明确接口类型
public class StudentComparator implements Comparator<Student>{

	public StudentComparator() {
		super();
	}
//	// 第一种写法 明确类型
//	@Override
//	public Integer compare(Object o1, Object o2) {
//		if(o1 instanceof Student && o2 instanceof Student ){
//			return (((Student) o1).getAge() - ((Student) o2).getAge());
//		}
//		return null;
//	}
	@Override
	public Integer compare(Student o1, Student o2) {
			return  o1.getAge() - o2.getAge();
	}


}
