// 11. Java Program to Illustrate Use of Methods in a Class

class Q11
{
	int a;
	int b;
	int add;
	
	void add(int a,int b)
	{
		add=a+b;
		System.out.println("Addition is:"+add);
	}
	
	public static void main(String args[])
	{
		Q11 q1=new Q11();
		q1.add(10,11);
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q11.java

I:\Diwali Assignment\Class and Object>java Q11
Addition is:21

*/
