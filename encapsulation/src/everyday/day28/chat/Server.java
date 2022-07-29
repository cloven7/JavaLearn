package everyday.day28.chat;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description
 * 1.
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/28 17:21
 * @Version 1.0
 */
public class Server {



	@SuppressWarnings("all")
	public static void main(String[] args){
		// 创建服务器
		try(ServerSocket serverSocket = new ServerSocket();)
		{
			// 绑定端口
			serverSocket.bind(new InetSocketAddress(8888));
			// 开始监听
			System.out.println("\"服务器已经启动\" = " + "服务器已经启动:端口8888");
			while(true){
				Socket socket = serverSocket.accept();
				new ServerThread(socket).start(); // 线程池
			}
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
