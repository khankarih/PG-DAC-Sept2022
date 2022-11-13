// 24. Java Program to Demonstrate Usage of a Static Variable in the Test Class

class Q24
{
	static int a=10;
	
	static void display()
	{
		System.out.println(a);
	}
	
	public static void main(String args[])
	{
		Q22 q1=new Q22();
		q1.display();
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q24.java

I:\Diwali Assignment\Class and Object>java Q24
10
				
*/			