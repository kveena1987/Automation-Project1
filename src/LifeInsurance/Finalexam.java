package LifeInsurance;

public class Finalexam {
	
	
	
	public void area(int a)
	{
		System.out.println(a);
	}
	public void area(int x,int y)
	{
		System.out.println(x+y);
	}
	public void area(int b,int c,int k)
	{
		System.out.println(b*c*k);
	}

	public static void main(String[] args) {
		Finalexam f=new Finalexam();
		f.area(10);
		f.area(10,20);
		f.area(10,20,30);
	}

}
