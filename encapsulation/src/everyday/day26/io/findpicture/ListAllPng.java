package everyday.day26.io.findpicture;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 10:51
 * @Version 1.0
 */
public class ListAllPng {


	@Test
	public void testFindAllPng() {

		ListAllPng listAllPng = new ListAllPng();
		String path = "C:\\Users\\19048\\Desktop\\JAVA_LEET\\image";
		listAllPng.findAll(path);

	}

	public void findAll(String path) {
		// 1.尝试列出当前文件夹下的所以图片

		File file = new File(path);
//		String[] list = file.list(new MyFilter());
//		String[] list = file.list((f, n) -> n.contains("png"));
		// 2.过滤文件夹和png
		File[] list = file.listFiles((f, n) -> new File(f, n).isDirectory() || n.contains("png"));

//		System.out.println("Arrays.toString(list) = " + Arrays.toString(list));
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

			}

		}
//		System.out.println("Arrays.toString(list) = " + Arrays.toString(list));
	}


	static class MyFilter implements FilenameFilter {
		@Override
		public boolean accept(File dir, String name) {
			return name.contains("png");
		}
	}


}
