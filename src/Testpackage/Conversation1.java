package Testpackage;

public class Conversation1 {
	
	String s="100";
	int i=100;
	long l=20000l;
	String s2="ganga";
	float f1=10.0f;
	
	public void display()
	{
		int i=Integer.parseInt(s);//string to int
		System.out.println(i);	//o/p:100
		System.out.println(i+100);	//200
		
		String s1=String.valueOf(i);		//int to string
		System.out.println(s1);				//100
		System.out.println(s1+100);			//100100
		
		int j=(int) l;
		System.out.println(j);
		
		double d1=(double)f1;
		System.out.println(d1);
		
		double d=Double.parseDouble(s);
		System.out.println(d);
		
		float f=Float.parseFloat(s);
		System.out.println(f);
		
		char c=s2.charAt(1);
		System.out.println(c);
		
		
	
		for(int k=0;k<s2.length();k++)
		{
			char c2=s2.charAt(k);
			System.out.println("the i values id"+k+ "string is "+c2);
		}
		
		for(int b=0;b<s2.length();b++)
		{
			char r=(char) s2.length();
		System.out.println("the value is "+b+ "char is"+r);
		}
		
		
		
		
	}
	

	public static void main(String[] args) {
		
		Conversation1 c=new Conversation1();
		c.display();
		

	}

}
