package DesignPatterns.Builder.Assignments.Message;


public class MessageBuilder implements Builder {

    private  MessageType message_type;
    private  String content;
    private  String sender;
    private  String recipient;
    private  boolean is_delivered;
    private  int timestamp;

    public MessageBuilder with_type(MessageType message_type) {
        this.message_type = message_type;
        return this;
    }

    public MessageBuilder with_content(String content) {
        this.content = content;
        return this;
    }

    public MessageBuilder with_sender(String sender) {
        this.sender = sender;
        return this;
    }

    public MessageBuilder with_recipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    public MessageBuilder setDelivered(boolean is_delivered) {
        this.is_delivered = is_delivered;
        return this;
    }

    public MessageBuilder setTimeStamp(int timestamp) {
        this.timestamp = timestamp;
        return this;
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

    public boolean Is_delivered() {
        return is_delivered;
    }

    public int getTimestamp() {
        return timestamp;
    }

    @Override
    public Message build() {
        return new Message(this);
    }
}
