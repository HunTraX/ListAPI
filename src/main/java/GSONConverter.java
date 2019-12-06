import com.google.gson.Gson;

import java.util.List;

public class GSONConverter {
    private static Gson gson = new Gson();

    public static String objectToGSON(Object o){
        return gson.toJson(o);
    }

    public static String listToGSON(List l){
        return gson.toJson(l);
    }

    public static Message GSONToMessage(String s){
        try {
            return gson.fromJson(s, Message.class);
        } catch (Exception e){
             throw e;
    }
    }
}
