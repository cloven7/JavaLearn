package everyday.day27.annotations.littlehomework;

import everyday.day27.annotations.Dog;
import everyday.day27.annotations.littlehomework.context.ApplicationContext;
import everyday.day27.annotations.littlehomework.handler.SingletonHandler;
import everyday.day27.annotations.littlehomework.util.FileUtils;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 所有的单例都会放在某一个集合里
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/27 10:48
 * @Version 1.0
 */
public class Bootstrap {

	public static List<String> PATHS = new ArrayList<>();

	// 类加载之后处理
	static {
		// 想办法获取classpath
		String s = "everyday/day27";
		// 拿到根目录 ，s为空，拿到当前项目的根路径
		URL resource = Thread.currentThread().getContextClassLoader().getResource(s);
		final URL resources = Thread.currentThread().getContextClassLoader().getResource("");
		System.out.println("resource.getPath() = " + resource.getPath());
		File file = new File(resource.getFile());
		File[] files = file.listFiles();
		for (File file1 : files) {
			System.out.println("file1.getName() = " + file1.getName());
		}
		// 一句话拿到全限定名称（未改）
		testFindAll(resource.getPath());

		// C:\Users\19048\Desktop\JAVA_LEET\out\production\encapsulation\everyday\day27\annotations\littlehomework\ApplicationContext.class
		// everyday.day27.annotations.littlehomework
		// 遍历绝对路径，变成全限定名
		List<String> collect = FileUtils.getClassPath(PATHS, resources);

		// 处理对应的全限定名称
		try {
			SingletonHandler.handler(collect);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// spring 在程序启动起来，程序就保存了上下文，可以从上下文中获取实例对象，在实际工程当中，不可能所有的类都保存有状态（只有成员方法，没有具体的属性（无状态），这种类就适合做出单例
		// 需要的时候直接从容器中拿到这个类，调用方法即可，这种类要想办法注入到容器当中

		Dog singleton = ApplicationContext.getSingleton(Dog.class);
		System.out.println("singleton = " + singleton);
	}


	/*public static void testFindAll(File file){
		findAll(file.getPath());
	}*/
	public static void testFindAll(String path){
		findAll(path);
	}

	public static void findAll(String path) {
		// 1.尝试列出当前文件夹下的所有.class文件
		File file = new File(path);
		// 2.过滤文件夹和class文件
		File[] list = file.listFiles((f, n) -> new File(f, n).isDirectory() || n.contains(".class"));

		if (list == null || list.length == 0)
			return;
		for (File parent : list) {
			// 看看是不是一个文件夹，如果是
			if (parent.isDirectory()) {
				// 递归
				findAll(parent.getAbsolutePath());
			} else {
				// 不是的话
				System.out.println(parent.getName());
				PATHS.add(parent.getAbsolutePath());
			}
		}
	}
}
