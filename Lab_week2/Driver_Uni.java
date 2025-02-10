public class Driver_Uni{
	public static void main(String arg[]){
		//loose encapsulation
		University u=new University();
		u.setUni_name("COMSATS UNIVERSITY");
		
		Campus c1 = new Campus();
		Campus c2 = new Campus();
		c1.setCamp_name("Lahore Campus");
		c2.setCamp_name("Isl Campus");
		u.setCamp1(c1);
		u.setCamp2(c2);
		
		Department c1d1=new Department();
		Department c1d2=new Department();
		Department c2d1=new Department();
		Department c2d2=new Department();
		c1d1.setName("Computer Sciense Department");
		c1d2.setName("Software Engineering Department");
		c2d1.setName("Psycology Department");
		c2d2.setName("English Department");
		c1d1.setHod_name("Sir 1");
		c1d2.setHod_name("Sir 2");
		c2d1.setHod_name("Sir 3");
		c2d2.setHod_name("Sir 4");
		c1.setCs(c1d1);
		c1.setSE(c1d2);
		c2.setCs(c2d1);
		c2.setSE(c2d2);
		
		u.uni_info();
		
		
	}
	
}