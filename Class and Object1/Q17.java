// 17. Java Program to Illustrate Use of Constructor

class Q17
{
	int a;
	int b;
	
	Q17()
	{
		this.a=a;
		this.b=b;
	}
	
	Q17(int a,int b)
	{
		int res=a*b;
		System.out.println("Multiplication is: "+res);
	}
	
	public static void main(String args[])
	{
		Q17 q1=new Q17(10,15);
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q17.java

I:\Diwali Assignment\Class and Object>java Q17
Multiplication is: 150

*/
		
	