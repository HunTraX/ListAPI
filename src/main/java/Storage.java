import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Message> messageList;
    private List<Warning> warningList;

    public Storage() {
        this.messageList = new ArrayList<>();
        this.warningList = new ArrayList<>();
    }

    public void addMessage (Message message){
        messageList.add(message);
    }

    public  List<Message> getMessageList (){
        return messageList;
    }

    public List<Warning> getWarningList(){
        return warningList;
    }

    public void addWarning(Warning warning){
        warningList.add(warning);
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

}
