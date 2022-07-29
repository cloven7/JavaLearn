package everyday.day28.chat.constant;

import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/28 19:28
 * @Version 1.0
 */
public class Constant {

	// 所有成功的常量
	public static final String  SUCCESS = "SUCCESS";

	// 所有成功的常量
	public static final String  FAIL = "FAIL";

	// 服务器名字
	public static final String  SERVER_NAME = "server";

	public static final String  OK = "ok";

	// 默认密码
	public static final String  DEFAULT_PASSWORD = "123";

	// 保存在线的用户
	public static final Map<String, Socket> ONLINE_USERS = new ConcurrentHashMap<>(8);
}
