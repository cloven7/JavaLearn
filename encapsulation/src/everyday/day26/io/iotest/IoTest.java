package everyday.day26.io.iotest;

import org.junit.Test;

import java.io.*;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 14:27
 * @Version 1.0
 */
public class IoTest {
	String path = "C:\\Users\\19048\\Desktop\\JAVA_LEET\\image";

	@Test // 每次读出bytes长度的内容，将其拼接起来
	public void testRead1() throws IOException {
		File file = new File(path, "aba.txt");
		if(!file.isFile()){
			return;
		}
		InputStream inputStream = new FileInputStream(file);
		int read;// 读出来是byte 转成 int
		byte[] bytes = new byte[7];
		StringBuilder sb = new StringBuilder();
		int len = 0;
		while((read = inputStream.read(bytes)) != -1){
			System.out.println("read = " + read);
			// 每次读出多少字节，就把对应的字节转换成字符串
			sb.append(new String(bytes, 0, read));
		}
		System.out.println("sb = " + sb);
	}

	@Test
	public void writeTest() throws IOException {

		byte[] bytes = {97, 98, 99, 100};
		File file = new File(path, "a.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		// true 表示是否追加
		OutputStream outputStream = new FileOutputStream(file, true);
		outputStream.write(bytes);

		outputStream.write("heooollllloooooowoooorld".getBytes());

	}

	@Test
	// read()一个一个读
	public void readOne() throws IOException {
		File file = new File(path, "aba.txt");
		if(!file.isFile()){
			return;
		}
		InputStream inputStream = new FileInputStream(file);
		int read;// 读出来是byte 转成 int
		int index = 0;
		byte[] bytes = new byte[(int)file.length()];
		while((read = inputStream.read()) != -1){
			byte b = (byte)read;
			bytes[index++] = b;
			System.out.println("read = " + read);
		}
		System.out.println("new String(bytes) = " + new String(bytes));
	}

}
