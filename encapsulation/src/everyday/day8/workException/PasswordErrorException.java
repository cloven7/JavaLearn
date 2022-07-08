package everyday.day8.workException;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 10:15
 * @Version 1.0
 */
public class PasswordErrorException extends RuntimeException{

	public PasswordErrorException(){

	}

	public PasswordErrorException(Throwable cause) {
		super(cause);
	}

	@Override
	public synchronized Throwable initCause(Throwable cause) {
		return super.initCause(cause);
	}
}
