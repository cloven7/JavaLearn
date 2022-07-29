package everyday.day28.chat.util;

import everyday.day28.chat.Message;

import java.io.*;
import java.util.Optional;

/**
 * @Description 消息发送工具类
 * ***工具类不要关闭资源***
 * @Author clovenine
 * @Date 2022/7/28 17:41
 * @Version 1.0
 */
public class MessageUtils {

	// 从流中读取message
	public static Optional<Message> readMsg(InputStream inputStream){

		ObjectInputStream objectInputStream = null;
		try {
			objectInputStream = new ObjectInputStream(inputStream);
			// 封装成一个Optional，将来外界使用的时候，就可以避免空指针
			return Optional.ofNullable((Message) objectInputStream.readObject());
		} catch (IOException | ClassNotFoundException e){
			e.printStackTrace();
		}
		return Optional.empty();
	}

	// 写消息
	public static void writeMsg(OutputStream outputStream, Message message){
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(outputStream);
			oos.writeObject(message);
			oos.flush();
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
