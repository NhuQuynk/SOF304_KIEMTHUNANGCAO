package Lab02.Bai02;

public class MessageUtil {
	private String message;
	public MessageUtil(String message) {
		this.message = message;
	}

	public String printMessage(String message) {
		System.out.println(message);
		return message;	
	}
	public String printMessageNew(String message) {
		message = "Hi"+message;
		System.out.println(message);
		return message;	
	}
}
