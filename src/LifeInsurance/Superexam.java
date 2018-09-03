package LifeInsurance;

public class Superexam extends Car {
	
	
	int employeeno;
	String name;
	Float salary;
	public void empdetails(int employeeno,String name,float salary)
	{
		System.out.println(employeeno+" "+name+" "+salary);
	}
	public void car()
	{
		super.cardetails(398, "nani");
		System.out.println("Car Details");
	}

	public static void main(String[] args) {
		Superexam s=new Superexam();
		s.empdetails(10,"vani",2000);
		s.car();
	}

}
