package DesignPatterns.Builder.Assignments.Message;

public class Main {

    public static void main(String[] args) {

        Message message = new MessageBuilder()
                .with_type(MessageType.TEXT)
                .with_content("Hello, World!")
                .with_sender("Alice")
                .with_recipient("Bob")
                .setDelivered(true)
                .setTimeStamp(1633072800)
                .build();

        System.out.println("Message Type: " + message.getMessage_type());
        System.out.println("Content: " + message.getContent());
        System.out.println("Sender: " + message.getSender());
        System.out.println("Recipient: " + message.getRecipient());
        System.out.println("Is Delivered: " + message.isIs_delivered());
        System.out.println("Timestamp: " + message.getTimestamp());
    }
}
