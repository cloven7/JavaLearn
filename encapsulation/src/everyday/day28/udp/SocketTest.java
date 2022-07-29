package everyday.day28.udp;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/28 15:41
 * @Version 1.0
 */
public class SocketTest {

	@Test
	public void inetAddressTest() throws UnknownHostException {
		InetAddress inetAddress = InetAddress.getLoopbackAddress();
		System.out.println("inetAddress = " + inetAddress);
		InetAddress[] name = InetAddress.getAllByName("www.baidu.com");
		for (InetAddress address : name) {
			System.out.println("address = " + address); // 一个域名可以拿到多个IP地址，负载均衡
		}
//		InetAddress[] names = InetAddress.getAllByName("localhost");
		InetAddress[] names = InetAddress.getAllByName("CBACOMPUTER");
		for (InetAddress address : names) {
			System.out.println("address = " + address);
		}
	}

	@Test
	public void urlTest() throws IOException {
		URL url = new URL("https://wallhaven.cc/w/z8k9yw");
		System.out.println("url.getProtocol() = " + url.getProtocol());
		System.out.println("url.getHost() = " + url.getHost());
		System.out.println("url.getPath() = " + url.getPath());

		URLConnection urlConnection = url.openConnection();
		InputStream inputStream = urlConnection.getInputStream();
		OutputStream outputStream = new FileOutputStream("C:\\list\\a.html");
		byte[] buf = new byte[1024];
		int read;
		while((read = inputStream.read(buf)) != -1){
			outputStream.write(buf, 0, read);
		}

	}

	@Test
	public void serverTest() throws IOException {
		// 创建ServerSocket
		ServerSocket server = new ServerSocket();
		// 绑定在某一端口上
		server.bind(new InetSocketAddress(InetAddress.getLoopbackAddress(), 8887));
		System.out.println("服务器启动");
		// 监听在这个端口
		Socket accept = server.accept();

		InputStream inputStream = accept.getInputStream();
		byte[] buf = new byte[1024];
		int read;
		while((read = inputStream.read(buf)) != -1){
			System.out.println(new String(buf, 0, read));
		}

		System.out.println("服务器结束");
		inputStream.close();
		accept.close();
		server.close();
	}

	@Test
	public void clientTest() throws IOException {
		// 创建Socket
		Socket socket = new Socket();
		// 使用这个socket进行连接
		socket.connect(new InetSocketAddress(InetAddress.getLoopbackAddress(),8887));

		InputStream inputStream = socket.getInputStream();
		OutputStream outputStream = socket.getOutputStream();

		outputStream.write("hello server!".getBytes(StandardCharsets.UTF_8));
		outputStream.close();
		inputStream.close();
		socket.close();


	}


}
