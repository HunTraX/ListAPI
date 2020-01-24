import com.google.gson.Gson;

import java.time.LocalDateTime;

public class Message {
    private String content;
    private String reciever;
    private String sender;
    private LocalDateTime timestamp;
    private MessageType type;

    public Message(String content, String sender, MessageType type) {
        this.content = content;
        this.reciever = "System";
        this.sender = sender;
        this.timestamp = LocalDateTime.now();
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getAsJSON(){
       return GSONConverter.objectToGSON(this);
    }
}
