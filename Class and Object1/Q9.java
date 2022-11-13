// 9. Java Program to Implement the Passing and Returning Objects

class Q9
{
	int l,b,area;
	
	Q9 area(Q9 obj)
	{
		obj=new Q9();
		obj.l=l;
		obj.b=b;
		obj.area=5*6;
		return obj;
	}
	
	public static void main(String args[])
	{
		Q9 q1=new Q9();
		Q9 a=q1.area(q1);
		System.out.println("Area is: "+a.area);
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q9.java

I:\Diwali Assignment\Class and Object>java Q9
Area is: 30

*/
	