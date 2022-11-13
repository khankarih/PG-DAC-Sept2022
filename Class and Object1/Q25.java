// 25. Java Program to Check Whether Which One is Executed First, Static Block or the Static Method

class Q25
{
	static
	{
		System.out.println("Static block");
	}
	
	static void display()
	{
		System.out.println("Static Method");
	}
	
	public static void main(String args[])
	{
		display();
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q25.java

I:\Diwali Assignment\Class and Object>java Q25
Static block
Static Method

*/