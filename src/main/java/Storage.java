import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Message> messageList;

    public Storage() {
        this.messageList = new ArrayList<>();
    }

    public void addMessage (Message message){
        messageList.add(message);
    }

    public  List<Message> getMessageList (){
        return messageList;
    }
}
