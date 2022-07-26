package everyday.day26.io.reader1test;

import org.junit.Test;

import java.io.*;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 15:37
 * @Version 1.0
 */
public class ReaderTest {

	String path = "C:\\Users\\19048\\Desktop\\JAVA_LEET\\image";
	String to = "C:\\Users\\19048\\Desktop\\JAVA_LEET\\video\\b.txt";

	@Test
	public void readerTest() throws IOException {

		File file = new File(path , "a.txt");
		// 把输入流建立在文件上
		Reader reader = new FileReader(file);

		Writer writer = new FileWriter(to);

		int read;
		char[] buf = new char[1024 * 1024];
		while((read = reader.read(buf)) != -1){
			writer.write(buf, 0, read);
		}
		writer.flush();
		reader.close();
		writer.close();

	}

}
