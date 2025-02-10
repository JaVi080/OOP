public class University{
	private String uni_name;
	private Campus camp1;
	private Campus camp2;
	
	//setters
	public void setUni_name(String uni_n){
		uni_name=uni_n;
	}
	public void setCamp1(Campus c1){
		camp1=c1;
	}
	public void setCamp2(Campus c2){
		camp2=c2;
	}
	
	//getters
	public String getUni_name(){
		return uni_name;
	}
	public Campus getCamp1(){
		return camp1;
	}
	public Campus getCamp2(){
		return camp2;
	}
	
	//method to dispaly information
	public void uni_info(){
		System.out.println("University Name : " +uni_name);
		camp1.camp_info();
		camp2.camp_info();
	}
	
	
}