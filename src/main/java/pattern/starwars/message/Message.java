package pattern.starwars.message;

public class Message {

	private String message;

	public Message(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "Message [message=" + message + "]";
	}
}