package everyday.day26.io.copyvideo;

import org.junit.Test;

import java.io.*;
import java.util.Random;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 15:31
 * @Version 1.0
 */
public class CopyVideoJava8 {
	String path = "C:\\Users\\19048\\Desktop\\JAVA_LEET\\video";
	String to = "C:\\Users\\19048\\Desktop\\JAVA_LEET\\image\\";

	@Test
	public void copyFileTest() {

		File file = new File(path, "video.mp4");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 自动释放资源（自动关闭资源的能力）
		try (InputStream inputStream = new FileInputStream(file);
			 OutputStream outputStream = new FileOutputStream(to + "video.mp4", true))
		{
			if(new Random().nextInt(10) > 2)
				throw new IOException();
			// 把输入流建立在文件上
			// 建立一个输入流
			// 一边读流中的字节， 一边写出文件
			long start = System.currentTimeMillis();
			int read;
			// 建立缓冲区
			// 缓冲区的读和写 end - start = 2
			byte[] buf = new byte[1024 * 1024];
			while ((read = inputStream.read(buf)) != -1) {
				outputStream.write(buf, 0, read);
			}
			long end = System.currentTimeMillis();
			System.out.println("end - start = " + (end - start));
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
