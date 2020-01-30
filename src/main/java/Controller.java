import com.google.gson.JsonParser;
import io.javalin.Javalin;
import org.javalite.activejdbc.DB;

public class Controller {
    public static void main(String[] args){
        Javalin app = Javalin.create().start(80);
        // Get Methods
        app.get("/load/Messages", ctx -> {
            ctx.result(StorageController.getAllMessages());
        });

        app.get("/load/Warnings", ctx -> {
            ctx.result(StorageController.getAllMessages());
        });

        app.get("/load/Warnings/:system", ctx -> {
            ctx.result(StorageController.getAllWarningsForSystem(Integer.getInteger("sytem")));
        });
        

        app.get("/load/Messages/from/:userId", ctx -> {
            ctx.result(StorageController.getAllMessagesFromUser(ctx.pathParam("userId")));
        });

        app.get("/load/Messages/For/:userId", ctx -> {
            ctx.result(StorageController.getAllMessagesForUser(ctx.pathParam("userId")));
        });

        // Save Methods
        app.post("/save/Message", ctx -> {
            System.out.println(ctx.body());
            StorageController.addMessage(GSONConverter.GSONToMessage(ctx.body()));
        });

        app.post("/save/Warning", ctx -> {
            System.out.println(ctx.body());
            StorageController.addWarning(GSONConverter.GSONToWarning(JsonParser.parseString(ctx.body()).getAsJsonObject()));
        });


    }
}
