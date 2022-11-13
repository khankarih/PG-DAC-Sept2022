// 21. Java Program to Allocate and Initialize Super Class Members using Constructor

class Parents
{
	Parents(int a,int b)
	{
		int res=a+b;
		System.out.println("Addition is: "+res);
	}
}

class Child extends Parents
{
	Child(int p,int q)
	{
		super(30,40);
		int res=p*q;
		System.out.println("Multiplication is: "+res);
	}
}

class Q21
{
	public static void main(String args[])
	{
		Child c1=new Child(60,70);
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q21.java

I:\Diwali Assignment\Class and Object>java Q21
Addition is: 70
Multiplication is: 4200

*/
	