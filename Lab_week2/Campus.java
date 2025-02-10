public class Campus{
	private String camp_name;
	private Department cs;
	private Department sE;
	
	//Setter Method 
	public void setCamp_name(String camp_n){
		camp_name=camp_n;
	}
	public void setCs(Department cs1){
		cs=cs1;
	}
	public void setSE(Department sE1){
		sE=sE1;
	}
	
	//getter Method 
	public String getCamp_n(){
	return camp_name;
	}
	public Department getCs(){
		return cs;
	}
	public Department getSE(){
		return sE;
	}
	
	//Method for displaying info
	public void camp_info(){
		System.out.println("\nCampus Name : "+camp_name+"\n Department name : " + cs.dep_info());
		System.out.println("\nCampus Name : "+camp_name+"\n Department name : " + sE.dep_info());
	}
	
		
}