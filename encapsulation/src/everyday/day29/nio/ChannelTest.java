package everyday.day29.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

/**
 * @Description channel
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/29 17:35
 * @Version 1.0
 */
public class ChannelTest {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\19048\\Desktop\\JAVA_LEET\\video\\b.txt");
		// 拿到一个通向文件的通道
		FileChannel channel = fileOutputStream.getChannel();
		// 使用put要flip移动指针，wrap直接将
		ByteBuffer byteBuffer = ByteBuffer.wrap("hello nio!".getBytes(StandardCharsets.UTF_8));

		channel.write(byteBuffer);
		channel.close();
		fileOutputStream.close();
	}

}
