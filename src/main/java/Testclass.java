import com.google.gson.Gson;

import java.time.LocalDateTime;

public class Testclass {

    public static void main(String[] args){
        Gson gson = new Gson();
        Message m = new Message("Testttttt", "Alisa","Patrick", LocalDateTime.now(), MessageType.MESSAGE);

        System.out.println(gson.toJson(m));
    }
}
