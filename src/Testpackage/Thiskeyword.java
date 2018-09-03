package Testpackage;

public class Thiskeyword {
	
	
	int x1;
	int y1;
	
	public void set(int x,int y)
	{
		x1=x;
		y1=y;
		System.out.println(x);
		System.out.println(y);
	}
	public void display()
	{
		System.out.println(x1);
		System.out.println(y1);
	}
	public static void main(String[] args) {
		
		Thiskeyword tk=new Thiskeyword();
		tk.set(10, 20);
		tk.display();

	}

}
