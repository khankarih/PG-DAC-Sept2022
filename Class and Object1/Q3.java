//3.Java Program to Illustrates Use of Instance Inner Class

class Outer
{
	private class Inner
	{
		public void display()
		{
			System.out.println("Hello");
		}
	}
		void display_Inner()
		{
			Inner i1=new Inner();
			i1.display();
		}
}

public class Q3
{
	public static void main(String args[])
	{
		Outer q=new Outer();
		q.display_Inner();
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q3.java

I:\Diwali Assignment\Class and Object>java Q3
Hello

*/