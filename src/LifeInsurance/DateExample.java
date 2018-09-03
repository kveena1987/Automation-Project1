package LifeInsurance;
import java.util.Date;
//import java.sql.Date;

public class DateExample {
	
	
	String name="Hi_How_are.yous";
	public void name1()
	{
		String out=name.replace("_", "?");
		System.out.println(out);
	}
	public void name2()
	{
		Date d=new Date();
		System.out.println(d.getdate());
	}
	
	

	public static void main(String[] args) {

		
		DateExample de=new DateExample();
		de.name1();
		de.name2();
	}

}
