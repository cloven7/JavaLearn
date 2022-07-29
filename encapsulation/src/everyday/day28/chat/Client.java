package everyday.day28.chat;

import everyday.day28.chat.constant.Constant;
import everyday.day28.chat.constant.MessageType;
import everyday.day28.chat.util.MessageUtils;
import everyday.day28.chat.util.ScannerUtil;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

/**
 * @Description
 * 功能
 * 1.给服务器发消息
 * 2.给好友发消息
 * 3.群发消息
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/28 17:21
 * @Version 1.0
 */
public class Client {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		Socket socket = new Socket();
		// 连接服务器
		socket.connect(new InetSocketAddress(8888));
		// 发消息  消息序列化发送
		OutputStream outputStream = socket.getOutputStream();
		InputStream inputStream = socket.getInputStream();



		// 表示当前登录的用户，标识
		String username = null;
		while(true){
			// 先登录
			// 想个办法判断有没有登录
			if(username == null){
				username = login(outputStream, inputStream);
			} else {
				// 打印菜单
				printOrder();
				String input = ScannerUtil.input();
				switch (Integer.parseInt(input)){
					case MessageType.TO_SERVER:
						sendToServer(username, outputStream, inputStream);
						break;
					case MessageType.TO_FRIEND:
						sendToFriend(username, outputStream, inputStream);
						break;
					case MessageType.TO_ALL:
						sendToAll(username, outputStream, inputStream);
						break;
					case MessageType.RECEIVER:
						receiveMsg(inputStream);
						break;
					default:
						break;
				}

			}

			// 退出
			int exit = new Random().nextInt(10000);
			if(exit == 0){
				break;
			}
		}

		// 关闭
		outputStream.close();
		socket.close();
	}

	private static void receiveMsg(InputStream inputStream) {
		while(true){
			Optional<Message> message = MessageUtils.readMsg(inputStream);
			message.ifPresent(m -> System.out.println(m.getUsername() + ": " + m.getContent()));
		}


	}

	private static void sendToAll(String username, OutputStream outputStream, InputStream inputStream) {

		boolean flag = true;
		while(flag) {
			System.out.print(username + ":");
			String msg = ScannerUtil.input();
			if ("bye".equals(msg)) flag = false;
			// 给服务器发送消息
			MessageUtils.writeMsg(outputStream,
					new Message(MessageType.TO_ALL, msg, username));
		}
	}

	private static void sendToFriend(String username, OutputStream outputStream, InputStream inputStream) {

		System.out.println("请输入好友的名字:");
		String friend = ScannerUtil.input();
		boolean flag = true;
		while(flag){
			System.out.print(username + ":");
			String msg = ScannerUtil.input();
			if("bye".equals(msg)) flag = false;
			// 给服务器发送消息
			MessageUtils.writeMsg(outputStream,
					new Message(MessageType.TO_FRIEND, msg, username, friend));
			// 接收服务器消息
//			Optional<Message> message = MessageUtils.readMsg(inputStream);
//			message.ifPresent(m -> System.out.println(m.getUsername() + ": " + m.getContent()));
		}

	}

	private static void sendToServer(String username, OutputStream outputStream, InputStream inputStream) {
		System.out.print(username + ":");
		String msg = ScannerUtil.input();
		// 给服务器发送消息
		MessageUtils.writeMsg(outputStream,
				new Message(MessageType.TO_SERVER, msg, username));
		// 接收服务器消息
		Optional<Message> message = MessageUtils.readMsg(inputStream);
		message.ifPresent(m -> System.out.println(m.getUsername() + ": " + m.getContent()));
	}

	private static void printOrder(){
		System.out.println("选择功能：" +
				MessageType.TO_SERVER + ".给服务器发送消息 " +
				MessageType.TO_FRIEND + ".给好友发消息 " +
				MessageType.TO_ALL + ".群发" +
				MessageType.RECEIVER + ".接收信息");
	}

	// 登录的方法
	private static String login(OutputStream outputStream, InputStream inputStream) {
		System.out.println("请您登陆！");
		System.out.println("请您输入用户名：");
		String name = ScannerUtil.input();
		System.out.println("请您输入密码：");
		String password = ScannerUtil.input();
		// 发送给服务器
		Message message = new Message();
		message.setType(MessageType.LOGIN);
		message.setUsername(name);
		message.setPassword(password);
		MessageUtils.writeMsg(outputStream, message);

		// 接收来自服务端的消息
		Optional<Message> message1 = MessageUtils.readMsg(inputStream);
		if(message1.isPresent() && Constant.SUCCESS.equals(message1.get().getContent())){
			System.out.println(message1);
			return name;
		}
		return null;
	}
}
