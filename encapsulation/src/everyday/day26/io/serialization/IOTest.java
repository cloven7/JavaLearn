package everyday.day26.io.serialization;

import org.junit.Test;

import java.io.*;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 17:37
 * @Version 1.0
 */
public class IOTest {

	@Test
	public void objectTest() throws IOException {

		OutputStream outputStream = new FileOutputStream("C:\\Users\\19048\\Desktop\\JAVA_LEET\\video\\b.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		// 写一个对象到磁盘 序列化
		User user = new User(12);
		objectOutputStream.writeObject(user);
		objectOutputStream.close();
		outputStream.close();
	}
	// 反序列化
	@Test
	public void objectTest2() throws IOException, ClassNotFoundException {

		InputStream inputStream = new FileInputStream("C:\\Users\\19048\\Desktop\\JAVA_LEET\\video\\b.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
		// 写一个对象到磁盘 序列化
//		User user = new User(12);
		User user1 = (User)objectInputStream.readObject();
		System.out.println("user1 = " + user1);
//		objectInputStream.readObject(user);
		objectInputStream.close();
		inputStream.close();
//		objectOutputStream.close();
//		outputStream.close();
	}
}
