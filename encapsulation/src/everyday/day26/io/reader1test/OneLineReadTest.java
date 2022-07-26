package everyday.day26.io.reader1test;

import org.junit.Test;

import java.io.*;

/**
 * @Description 处理流，一行一行的读文件
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 15:52
 * @Version 1.0
 */
public class OneLineReadTest {

	String path = "C:\\Users\\19048\\Desktop\\JAVA_LEET\\image";
	String to = "C:\\Users\\19048\\Desktop\\JAVA_LEET\\video\\b.txt";

	@Test // 一行一行的读数据
	public void oneLineRead() throws IOException {
		File file = new File(path , "a.txt");
		// 把输入流建立在文件上
		Reader reader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(reader);// 类似于花洒---处理流

		Writer writer = new FileWriter(to);

		int read;
		char[] buf = new char[1024 * 1024];
		String content;
		while((content = bufferedReader.readLine()) != null){
//			writer.write(buf, 0, read);
			System.out.println("content = " + content);
		}
		bufferedReader.close();
		writer.flush();
		reader.close();
		writer.close();
	}

	@Test // 将字符串输出到某一文件中
	public void OutputString() throws IOException {
		Writer writer = new FileWriter(to, true);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		String content = "将字符串输出到某一文件中\r\n";
		for (int i = 0; i < 10; i++) {
			bufferedWriter.newLine();
			bufferedWriter.write(content);
			bufferedWriter.flush();
		}

		writer.close();
	}


}
