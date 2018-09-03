package LifeInsurance;

public class login extends Abs {
	

	public static void main(String[] args) {
		login l=new login();
		l.absmethod();
		l.details();
	}

	@Override
	public void absmethod() {
		System.out.println("Login Id ");
		System.out.println("Password");
	}

}
