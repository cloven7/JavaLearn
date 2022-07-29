package everyday.day29.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/29 17:43
 * @Version 1.0
 */
public class NioClient {

	public static void main(String[] args) throws IOException, InterruptedException {
		SocketChannel socketChannel = SocketChannel.open();
		socketChannel.configureBlocking(false);
		socketChannel.connect(new InetSocketAddress(6666));
		if(socketChannel.finishConnect()){
			while(true){
				Scanner scanner = new Scanner(System.in);
				String nextInt = scanner.next();
				socketChannel.write(ByteBuffer.wrap(nextInt.getBytes(StandardCharsets.UTF_8)));

			}
		}


//		Thread.sleep(100000);
	}

}
