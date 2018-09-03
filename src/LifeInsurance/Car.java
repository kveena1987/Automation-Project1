package LifeInsurance;

public class Car {
	
	int carno;
	String carname;
	
	public void cardetails(int carno,String carname)
	{
		this.carno=carno;
		this.carname=carname;
		System.out.println(carno);
		System.out.println(carname);
		
	}
	

	public static void main(String[] args) {
		Car c=new Car();
		c.cardetails(789,"aaa");

	}

}
