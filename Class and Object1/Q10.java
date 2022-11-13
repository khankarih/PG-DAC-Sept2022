// 10. Java Program to Swap Objects using Swap() Method

class Q10
{
	static int a,b;
	
	Q10()
	{
		a=10;
		b=20;
	}
	
	void swap(int p,int q)
	{
		int res;
		res=p;
		p=q;
		q=res;
		System.out.println("Value1: "+p);
		System.out.println("Value1: "+q);
	}
	
	public static void main(String args[])
	{
		Q10 q1=new Q10();
		System.out.println("Before Swapping");
		System.out.println("Value1: "+a);
		System.out.println("Value1: "+b);
		System.out.println("After Swapping");
		q1.swap(a,b);
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q10.java

I:\Diwali Assignment\Class and Object>java Q10
Before Swapping
Value1: 10
Value1: 20
After Swapping
Value1: 20
Value1: 10

*/