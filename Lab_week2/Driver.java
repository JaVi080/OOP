public class Driver{
	public static void main(String arg[])
	{
		//tight encapsulation
		University u=new University();
		u.setUni_name("COMSATS University");
		
		u.setCamp1(new Campus());
		u.setCamp2(new Campus());
        u.getCamp1().setCs(new Department());
        u.getCamp1().setSE(new Department());
        u.getCamp2().setCs(new Department());
        u.getCamp2().setSE(new Department());
		
		u.getCamp1().setCamp_name("Lahore Campus");
		u.getCamp2().setCamp_name("Isl Campus");
		
		u.getCamp1().getCs().setName("N_block");
		u.getCamp1().getCs().setHod_name("Sir 1");
		u.getCamp1().getSE().setName("Psycology Department");
		u.getCamp1().getSE().setHod_name("Sir 2");
		
		u.getCamp2().getCs().setName("Chemistry Dept");
		u.getCamp2().getCs().setHod_name("Sir Asif");
		u.getCamp2().getSE().setName("Computer Department");
		u.getCamp2().getSE().setHod_name("Sir Shahi`d");
		
		
		u.uni_info();
		
	}
}
