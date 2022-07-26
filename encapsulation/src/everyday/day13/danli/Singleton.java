package everyday.day13.danli;

/**
 * @Description 终极单例
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/13 20:05
 * @Version 1.0
 */
public class Singleton {

	private static volatile Singleton instance;
	private Singleton (){

	}

	public static Singleton getInstance(){
		if(instance == null){
			synchronized (Singleton.class){
				if(instance == null){
					instance = new Singleton();
					return instance;
				}
			}
		}
		return instance;
	}

}
