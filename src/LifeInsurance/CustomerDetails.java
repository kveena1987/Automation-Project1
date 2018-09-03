package LifeInsurance;

public class CustomerDetails extends PolicyDetails{
	
	int customerno=98076;
	String customername="Lakshmi";
	float amount=5000;
	
	public void customerinf()
	{
		System.out.println("customer no:"+customerno);
		System.out.println("customer name:"+customername);
		System.out.println("amount is:"+amount);
	}

	public static void main(String[] args) {

		CustomerDetails cd=new CustomerDetails();
		
		cd.policyholder();
		cd.customerinf();
	}

}
