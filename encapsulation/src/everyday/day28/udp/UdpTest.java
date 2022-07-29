package everyday.day28.udp;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/28 16:26
 * @Version 1.0
 */
public class UdpTest {

	@Test
	public void udpClientTest() throws IOException {
		// 创建socket
		DatagramSocket socket = new DatagramSocket(8887); // 不写就随机一个端口，好处是不会重复利用端口

		String data = "hello world!";

		// 构建一个数据包
		DatagramPacket packet = new DatagramPacket(data.getBytes(), 0, data.getBytes().length,
				new InetSocketAddress(InetAddress.getByName("localhost"), 8080));

		// 发送数据包
		while(true)
		socket.send(packet);
//		socket.close();

	}
	@Test
	public void udpServerTest() throws IOException {
		DatagramSocket socket = new DatagramSocket(8080);


		while (true){
			byte[] buf = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf, 0, buf.length);
			socket.receive(packet);

			System.out.println("new String(buf) = " + new String(buf, 0, packet.getLength()));
		}


//		socket.close();


	}
}
