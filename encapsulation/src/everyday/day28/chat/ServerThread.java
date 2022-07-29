package everyday.day28.chat;

import everyday.day28.chat.constant.Constant;
import everyday.day28.chat.constant.MessageType;
import everyday.day28.chat.util.MessageUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;
import java.util.Optional;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/28 20:42
 * @Version 1.0
 */
public class ServerThread extends Thread{
	private Socket socket;


	public ServerThread(){

	}

	public ServerThread(Socket socket){
		this.socket = socket;
	}

	@Override
	public void run() {
		InputStream inputStream = null;
		try {
			inputStream = socket.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		OutputStream outputStream = null;
		try {
			outputStream = socket.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 获取消息
		while(true){
			// 读消息
			Optional<Message> message = MessageUtils.readMsg(inputStream);

			if(message.isPresent()){
				Message msg = message.get();
				switch (msg.getType()){
					case MessageType.LOGIN:
						loginHandler(inputStream, outputStream, msg, socket);
						break;
					case MessageType.TO_SERVER:
						sendToClient(inputStream, outputStream, msg);
						break;
					case MessageType.TO_FRIEND:
						sendToTarget(msg);
						break;
					case MessageType.TO_ALL:
						sendToAll(msg);
						break;
				}
			}

		}
	}
	// 遍历所有在线用户，给他们发消息
	private static void sendToAll(Message message) {
		// 先找到对应的socket
		for(Map.Entry<String, Socket> entry : Constant.ONLINE_USERS.entrySet()){
			try {
				MessageUtils.writeMsg(entry.getValue().getOutputStream(), message);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// 给目标用户发送消息
	private static void sendToTarget(Message message) {
		// 先找到对应的socket
		Socket socket = Constant.ONLINE_USERS.get(message.getFriendUsername());

		try {
			MessageUtils.writeMsg(socket.getOutputStream(), message);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void sendToClient(InputStream inputStream, OutputStream outputStream, Message message) {

//		Optional<Message> msg = MessageUtils.readMsg(inputStream);
		System.out.println(message.getUsername() + " 说: " + message.getContent());
		MessageUtils.writeMsg(outputStream, new Message(MessageType.FROM_SERVER, Constant.OK, Constant.SERVER_NAME));


	}

	private static void loginHandler(InputStream inputStream, OutputStream outputStream, Message message, Socket socket) {

		if(Constant.ONLINE_USERS.containsKey(message.getUsername())){
			MessageUtils.writeMsg(outputStream, new Message(MessageType.FROM_SERVER, Constant.FAIL, Constant.SERVER_NAME));
			return;
		}

		// 判断登录的逻辑
		if(!Constant.DEFAULT_PASSWORD.equals(message.getPassword())	|| message.getUsername() == null){
			// 验证失败
			MessageUtils.writeMsg(outputStream, new Message(MessageType.FROM_SERVER, Constant.FAIL, Constant.SERVER_NAME));
		} else {
			// 验证成功，放入到在线用户MAP中
			Constant.ONLINE_USERS.put(message.getUsername(), socket);
			MessageUtils.writeMsg(outputStream, new Message(MessageType.FROM_SERVER, Constant.SUCCESS, Constant.SERVER_NAME));
			System.out.println(message.getUsername() + " 登陆成功！");
		}
	}
}
