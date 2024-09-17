public class Department{
	private String name;
	private String hod_name;
	
	//Setter Methods
	public void setName(String name1){
		name=name1;
	}
	public void setHod_name(String hod_name1){
		hod_name=hod_name1;
	}
	
	//getter method 
	public String getName(){
		return name;
	}
	public String getHod_name(){
		return hod_name;
	}
	
	//Method for displaying info
	public String dep_info(){
		return "Name : "+name+ "\nHead of Department : "+hod_name;
	}
		
}