package everyday.day29.nio;

import java.nio.IntBuffer;

/**
 * @Description buffer 缓冲区
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/29 17:25
 * @Version 1.0
 */
public class BufferTest {

	public static void main(String[] args) {
		// 创建一个Int型的buffer，大小为5，相当于创建了一个大小为5的int数组
		IntBuffer intBuffer = IntBuffer.allocate(5);
		// 向buffer中添加数据
		for (int i = 0; i < intBuffer.capacity(); i++) {
			intBuffer.put(i);
		}

		// buffer读写切换
		intBuffer.flip();
		// 读取数据
		while(intBuffer.hasRemaining()){
			System.out.println("intBuffer.get() = " + intBuffer.get());
		}

	}

}
