package Testpackage;

public class Super2 extends Superkeyword {
	
	
	public float interestrate=10.14f;
	public double homeloan=3.89d;
	//public String name="sachin";
	
	public void getinterestrate()
	{
		//.interestrate;
		System.out.println(interestrate);
	}
	
	public void gethomeloan()
	{
		super.gethomeloan();
		System.out.println(homeloan);
	}
	public void empdetails()
	{
		
		//System.out.println(super.interestrate);
		//System.out.println(homeloan);
		System.out.println(name);
	}

	public static void main(String[] args) {
		

		
		Super2 s=new Super2();
		s.empdetails();
		s.gethomeloan();
	}

}
