package everyday.day26.copy;

import java.io.*;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 18:27
 * @Version 1.0
 */
public class DeepCopyUtil {

	public static <T> T deepCopy(T t) throws IOException, ClassNotFoundException {
		// 将对象写到字节数组当中
//		OutputStream outputStream = new ByteArrayOutputStream();
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(t);

		// 获取字节数组
		byte[] bytes = outputStream.toByteArray();
		// 用输入流读出
		ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
		T res =  (T) objectInputStream.readObject();

		objectInputStream.close();
		inputStream.close();
		objectOutputStream.close();
		outputStream.close();

		return res;
	}
}
