package ssm.exception;

//定义一个简单的异常类
public class CustomException extends Exception {

	//异常信息
	public String message;
	
	public CustomException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
