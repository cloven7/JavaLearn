package everyday.day26.io;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Description 文件IO基本操作
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 10:13
 * @Version 1.0
 */
public class FileTest {

	// /r/n 回车换行
	// /t 制表符
	@Test
	public void testFilePath(){
		System.out.println("C:\\Users\\19048\\Desktop\\JAVA_LEET\\DataStructure\\src\\leetcode");

		// 打开文件
		File file = new File("C:\\Users\\19048\\Desktop\\JAVA_LEET\\README.md");
		File file2 = new File("C:\\Users\\19048\\Desktop\\JAVA_LEET\\image\\img.png");
	}

	@Test
	public void testFile() throws IOException {
		File file = new File("C:\\Users\\19048\\Desktop\\JAVA_LEET\\image\\a.txt");
		System.out.println("file.getAbsoluteFile() = " + file.getAbsoluteFile());
		System.out.println("file.getParent() = " + file.getParent());
		System.out.println("file.getTotalSpace() = " + file.getTotalSpace());
		System.out.println("file.length() = " + file.length());
		System.out.println("file.isFile() = " + file.isFile());
		System.out.println("file.isDirectory() = " + file.isDirectory());
		// 如果存在就操作文件，否则创建
		System.out.println("file.exists() = " + file.exists());

		// 检查型异常
		if(!file.exists()){
			boolean newFile = file.createNewFile();
		}
//		System.out.println("file.delete() = " + file.delete());
		System.out.println("file.lastModified() = " + file.lastModified());
		System.out.println("file.getName() = " + file.getName());
		System.out.println("file.isFile() = " + file.isFile());

		file.renameTo(new File("C:\\Users\\19048\\Desktop\\JAVA_LEET\\image\\aba.txt"));
	}


}
