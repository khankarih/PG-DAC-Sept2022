//4.Java Program to Illustrates Use of Static Inner Class

class Q4
{
	static String msg="Hello";
	
	static class Innerclass
	{
		static void display()
		{
			System.out.println(msg+ " Good Morning");
		}
	}
	
	public static void main(String args[])
	{
		Innerclass i1=new Innerclass();
		i1.display();
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q4.java

I:\Diwali Assignment\Class and Object>java Q4
Hello Good Morning

*/