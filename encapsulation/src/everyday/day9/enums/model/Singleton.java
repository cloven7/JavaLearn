package everyday.day9.enums.model;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/9 9:46
 * @Version 1.0
 */
public class Singleton {

	private Singleton(){

	}

	public static Singleton getInstance(){
		return SingletonHolder.INSTANT.instant;
	}

	private enum SingletonHolder{
		INSTANT;
		private final Singleton instant;
		SingletonHolder(){
			instant = new Singleton();
		}
	}

	public static void main(String[] args) {
		System.out.println(Singleton.getInstance() == Singleton.getInstance());
	}

}
