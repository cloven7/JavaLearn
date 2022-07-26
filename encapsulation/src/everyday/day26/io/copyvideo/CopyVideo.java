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
 * @Date 2022/7/26 14:59
 * @Version 1.0
 */
public class CopyVideo {

	String path = "C:\\Users\\19048\\Desktop\\JAVA_LEET\\video";
	String to = "C:\\Users\\19048\\Desktop\\JAVA_LEET\\image\\";

	@Test
	public void copyFileTest() {

		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			if(new Random().nextInt(10) > 2)
				throw new IOException();

			File file = new File(path, "video.mp4");
			if (!file.exists()) {
				file.createNewFile();
			}
			// 把输入流建立在文件上
			inputStream = new FileInputStream(file);
			// 建立一个输入流
			outputStream = new FileOutputStream(to + "video.mp4", true);
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
		} finally {
			if(inputStream != null){
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(outputStream != null){
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}


		/*// 一个一个的读和写 end - start = 3938
		long start = System.currentTimeMillis();
		int read;
		while((read = inputStream.read()) != -1){
			outputStream.write(read);
		}
		long end = System.currentTimeMillis();
		System.out.println("end - start = " + (end - start));*/
	}

}
