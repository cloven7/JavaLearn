package everyday.day29.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/29 17:43
 * @Version 1.0
 */
public class NioServer {

	public static void main(String[] args) throws IOException {
		// 创建服务器
		ServerSocketChannel server = ServerSocketChannel.open();
		server.bind(new InetSocketAddress(6666));
		// 配置成非阻塞式的channel
		server.configureBlocking(false);
		// IO多路复用器
		Selector selector = Selector.open();
		// 注册
		server.register(selector, SelectionKey.OP_ACCEPT);

		while(true){
			// 阻塞的方法。返回值代表发生事件的通道的个数
			// 0 超时
			// -1 错误
			int select = selector.select();
			System.out.println("select = " + select);
			// 只要到这，说明发生了事情，有可读，可写，可连接的channel
			Set<SelectionKey> selectionKeys = selector.selectedKeys();
			Iterator<SelectionKey> iterator = selectionKeys.iterator();
			while(iterator.hasNext()){
				SelectionKey next = iterator.next();
				// 这个事件一斤处理就删除
				iterator.remove();
//				System.out.println("next = " + next);
				if(next.isAcceptable()){
					System.out.println("有人连接！");
					//
					SocketChannel accept = server.accept();
					accept.configureBlocking(false);
					accept.register(selector, SelectionKey.OP_READ, ByteBuffer.allocate(1024));
				}
				if(next.isReadable()){
					System.out.println("有信息可读");
					SocketChannel channel =(SocketChannel) next.channel();
					ByteBuffer buffer = (ByteBuffer)next.attachment();
					buffer.clear();
					channel.read(buffer);
					System.out.println(new String(buffer.array(), 0, buffer.position()));
				}

			}
		}

	}

}
