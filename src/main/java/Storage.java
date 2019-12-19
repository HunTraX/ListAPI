import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Message> messageList;
    private List<Validator> validators;

    public Storage(List<Message> messageList, List<Validator> validators) {
        this.messageList = messageList;
        this.validators = validators;
    }

    public void addMessage (Message message){
        messageList.add(message);
    }

    public  List<Message> getMessageList (){
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    public List<Validator> getValidators() {
        return validators;
    }

    public void setValidators(List<Validator> validators) {
        this.validators = validators;
    }
}
