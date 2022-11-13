//16. Java Program to Illustrate Use of Final Keyword

class Q16
{
	final int a=15;
	final int b=10;
	
	
	void add()
	{
		int res=a+b;
		System.out.println("Addition is: "+res);
	}
	
	public static void main(String args[])
	{
		Q16 q1=new Q16();
		q1.add();
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q16.java

I:\Diwali Assignment\Class and Object>java Q16
Addition is: 25

*/