
public class BrideGroom {
	
	DatabaseConnection con;
	String UUID;
	String name;
	
	
	BrideGroom(DatabaseConnection con, String UUID,String name)
	{
	  this.UUID = UUID;
	  this.name = name;
	  this.con = con;
	}
	public void updateDatabase()
	{
		
	}
	
	public void insertIntoDatabase();
	public void deleteFromDatabase();

}
