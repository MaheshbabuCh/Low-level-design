package DesignPatterns.Builder.Assignments.Message;

public class Message {

//    message_type: MessageType
//    content: str
//    sender: str
//    recipient: str
//    is_delivered: bool
//    timestamp: int

    private final MessageType message_type;
    private final String content;
    private final String sender;
    private final String recipient;
    private final boolean is_delivered;
    private final int timestamp;

    public Message(MessageBuilder builder){

        this.message_type = builder.getMessage_type();
        this.content = builder.getContent();
        this.sender = builder.getSender();
        this.recipient = builder.getRecipient();
        this.is_delivered = builder.Is_delivered();
        this.timestamp = builder.getTimestamp();

    }

    public MessageType getMessage_type() {
        return message_type;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public boolean isIs_delivered() {
        return is_delivered;
    }

    public int getTimestamp() {
        return timestamp;
    }
}
