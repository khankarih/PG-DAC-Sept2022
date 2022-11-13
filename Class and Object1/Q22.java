// 22. Java Program to Check the Accessibility of Static and Non-Static Variable by a Static Method

class Q22
{
	static int a=10;
	int b=20;
	
	public static void main(String args[])
	{
		Q22 q1=new Q22();
		System.out.println("Static Variable: "+a);
		System.out.println("Non-Static Variable: "+q1.b);
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q22.java

I:\Diwali Assignment\Class and Object>java Q22
Static Variable: 10
Non-Static Variable: 2

*/