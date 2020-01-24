import java.util.ArrayList;
import java.util.List;

public class StorageController {
    private static Storage storage = new Storage();

    public static String getAllMessages(){
        return GSONConverter.listToGSON(storage.getMessageList());
    }

    public static String getLastMessage(){
        return GSONConverter.objectToGSON(storage.getMessageList().get(storage.getMessageList().size()));
    }

    public static void addMessage(Message m){
        storage.addMessage(m);
    }

    public static String getAllMessagesFromUser(String user){
        List<Message> resultlist = new ArrayList<>();
        for(Message m: storage.getMessageList()){
            if (m.getSender().equals(user)){
                resultlist.add(m);
            }
        }
        return GSONConverter.listToGSON(resultlist);
    }

    public static String getAllMessagesForUser(String user){
        List<Message> resultlist = new ArrayList<>();
        for(Message m: storage.getMessageList()){
            if (m.getReciever().equals(user)){
                resultlist.add(m);
            }
        }
        return GSONConverter.listToGSON(resultlist);
    }

    public static String getAllWarnings(){
        return "";
    }


}
