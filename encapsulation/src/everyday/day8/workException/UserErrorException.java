package everyday.day8.workException;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 10:06
 * @Version 1.0
 */
public class UserErrorException extends RuntimeException{

	private int code;

	public UserErrorException() {
	}



	public UserErrorException(int code, String message) {
		super(message);
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
