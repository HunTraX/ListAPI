import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.DB;
import org.javalite.activejdbc.Model;

public class DBController {

	private DB db;

	DBController(){
		db = Base.open("org.postgresql.Driver", "jdbc:postgresql://localhost/MessageService?currentSchema=warnings", "postgres", "postgres");
	}

	public void saveObject(Model model){
		model.saveIt();
	}

	public void closeDB(){
		db.close();
	}
}
