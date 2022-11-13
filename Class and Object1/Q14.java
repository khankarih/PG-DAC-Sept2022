// 14. Java Program to Create a Method with 2 Parameters and without Return Type

class Q14
{
	int a,b;
	int res;
	
	void div(int a,int b)
	{
		res=a/b;
		System.out.println("Division is: "+res);
	}
	
	public static void main(String args[])
	{
		Q14 q1=new Q14();
		q1.div(100,5);
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q14.java

I:\Diwali Assignment\Class and Object>java Q14
Division is: 20

*/
		