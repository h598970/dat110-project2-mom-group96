package no.hvl.dat110.messages;



public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	private String topic;
	private String message;

	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic = topic;
		this.message = message;


	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	

	public String getTopic() {
		return topic;
	}

	// TODO:
	// Implement object variables - a topic and a message is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
	
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return super.toString() + "topic: " + topic + "message:\n" + message;
	}
}