import io.javalin.Javalin;

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
            ctx.result(StorageController.getAllWarningsForSystem("sytem"));
        });

        app.get("/load/Warnings/level/:warning_Level", ctx -> {
            ctx.result(StorageController.getAllWarningsWithSpecificLevel("warning_level"));
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
            StorageController.addWarning(GSONConverter.GSONToWarning(ctx.body()));
        });


    }

}
