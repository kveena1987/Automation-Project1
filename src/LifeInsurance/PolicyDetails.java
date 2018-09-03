package LifeInsurance;

public class PolicyDetails {
	int policyno=98765;
	String policyname="anadh bhima";
	
	
	public void policyholder()
	{
		System.out.println("Policy Details:"+policyno);
		System.out.println("policy name"+policyname);
	}
	

	public static void main(String[] args) {
		PolicyDetails pd=new PolicyDetails();
		pd.policyholder();


	}

}
