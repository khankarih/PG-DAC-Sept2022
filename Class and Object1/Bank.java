//6. Java Program to Create Outer Class Bank Account and the Inner Class Interest in it

class Bank1
{
	int p=10000;
	int r=5;
	int t=2;
	
	class Interest
	{
		void operation()
		{
			int si=(p*r*t)/100;
			System.out.println("Interest is: "+si);
		}
	}
	
	void display()
	{
		Interest i1=new Interest();
		i1.operation();
	}
}

class Bank
{
	public static void main(String args[])
	{
		Bank1 b1=new Bank1();
		b1.display();
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Bank.java

I:\Diwali Assignment\Class and Object>java Bank
Interest is: 1000

*/