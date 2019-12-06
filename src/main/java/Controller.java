import io.javalin.Javalin;

public class Controller {
    public static void main(String[] args){
        Javalin app = Javalin.create().start(80);

        app.get("/messages", ctx -> {
            ctx.result(StorageController.getAllMessages());
        });

        app.post("/revieceMessage", ctx -> {
            System.out.println(ctx.body());
            StorageController.addMessage(GSONConverter.GSONToMessage(ctx.body()));
        });

        app.get("/sendMessagesFrom/:userId", ctx -> {
            ctx.result(StorageController.getAllMessagesFromUser(ctx.pathParam("userId")));
        });

        app.get("/sendMessagesFor/:userId", ctx -> {
            ctx.result(StorageController.getAllMessagesFromUser(ctx.pathParam("userId")));
        });
    }

}
