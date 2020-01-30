import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.DB;

public class DBController {

	private static DB db;

	private DBController(){ }

	public static DB getDB(){
		 return Base.open("org.postgresql.Driver", "jdbc:postgresql://localhost/MessageService?currentSchema=warnings", "postgres", "postgres");
	}

}
