import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.List;
import java.util.Map;

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

    public static Warning GSONToWarning(JsonObject jsonObject){
        try {
            Warning warning = new Warning();
            for (Map.Entry entry: jsonObject.entrySet()){
                warning.set(entry.getKey().toString(), StringUtil.stringToObject(entry.getValue().toString()));
            }
            return warning;
        } catch (Exception e){
            throw e;
        }
    }
}
