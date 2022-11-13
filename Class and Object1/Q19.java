// 19. Java Program to Create an Object for Class and Assign Value in the Object using Constructor

class Q19
{
	int a;
	int b;
	
	Q19()
	{
		this.a=a;
		this.b=b;
	}
	
	Q19(int a,int b)
	{
		int res=a+b;
		System.out.println("Addition is: "+res);
	}
	
	public static void main(String args[])
	{
		Q19 q1=new Q19(10,15);
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q19.java

I:\Diwali Assignment\Class and Object>java Q19
Addition is: 25

*/