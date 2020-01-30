import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Message> messageList;
    private List<Warning> warningList;
    private DBController dbController;

    public Storage() {
        this.messageList = new ArrayList<>();
        this.warningList = new ArrayList<>();
        DBController dbController = new DBController();
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
        warning.saveIt();
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

}
