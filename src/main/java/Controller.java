import io.javalin.Javalin;

public class Controller {
    public static void main(String[] args){
        Javalin app = Javalin.create().start(80);

        app.get("/load/Messages", ctx -> {
            ctx.result(StorageController.getAllMessages());
        });

        app.get("/load/Warnings", ctx -> {
            ctx.result(StorageController.getAllMessages());
        });

        app.get("/load/Warnings/:system", ctx -> {

        })



        app.post("/save/Message", ctx -> {
            System.out.println(ctx.body());
            StorageController.addMessage(GSONConverter.GSONToMessage(ctx.body()));
        });

        app.get("/load/Messages/from/:userId", ctx -> {
            ctx.result(StorageController.getAllMessagesFromUser(ctx.pathParam("userId")));
        });

        app.get("/load/Messages/For/:userId", ctx -> {
            ctx.result(StorageController.getAllMessagesForUser(ctx.pathParam("userId")));
        });
    }

}
