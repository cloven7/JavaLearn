package everyday.day27.annotations.littlehomework.util;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/28 9:19
 * @Version 1.0
 */
public class FileUtils {

	public static List<String> getClassPath(List<String> PATHS, URL resources){
		// C:\Users\19048\Desktop\JAVA_LEET\out\production\encapsulation\everyday\day27\annotations\littlehomework\ApplicationContext.class
		// everyday.day27.annotations.littlehomework
		// 遍历绝对路径，变成全限定名
		List<String> collect = PATHS.stream().map(path -> {
			String absolutePath = new File(resources.getFile()).getAbsolutePath();
			System.out.println("absolutePath = " + absolutePath);
			return path.replace(absolutePath + "\\", "")
					.replaceAll("\\\\", ".").replace(".class", "");
		}).collect(Collectors.toList());
		return collect;
	}

}
