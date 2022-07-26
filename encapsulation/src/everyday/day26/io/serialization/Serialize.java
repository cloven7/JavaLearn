package everyday.day26.io.serialization;

/**
 * @Description 序列化和反序列化
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 17:13
 * @Version 1.0
 */
public class Serialize {
	// 序列化：将对象写入到IO流中，将内存模型的对象变成字节数字，可以进行存储和传输
	// 反序列化：从IO流中恢复对象，将存储在磁盘或者从网络接收的数据恢复成对象模型
	// 使用场景：所有可在网络上传输的对象都必须是可序列化的，否则会出错；所有需要保存到磁盘的java对象都必须是可序列化的
	// 该对象必须实现Serializable接口，才能被序列化
		

}
