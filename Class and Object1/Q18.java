// 18. Java Program to Illustrates Use of Chaining Constructor

class Q18
{
	Q18()
	{
		this("Hello");
		System.out.println("This is Default Constructor");
	}
	
	Q18(String str)
	{
		System.out.println("This is Parameterised Constructor");
	}
	
	public static void main(String args[])
	{
		Q18 q1=new Q18();
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q18.java

I:\Diwali Assignment\Class and Object>java Q18
This is Parameterised Constructor
This is Default Constructor

*/