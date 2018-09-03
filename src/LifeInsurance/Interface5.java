package LifeInsurance;

public class Interface5 implements Interfaceset,Interface1 {
	
	public void show()
	{
		System.out.println("show");
	}
	public void draw()
	{
		System.out.println("print");
	}
	
	

	public static void main(String[] args) {
		Interface5 i5=new Interface5();
		i5.show();
		i5.draw();

	}

}
