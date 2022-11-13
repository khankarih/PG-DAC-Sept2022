// 8. Java Program to Count Number of Objects Created for Class

class Q8
{
	static int count=0;
	Q8()
	{
		count++;
	}
	
	public static void main(String args[])
	{
		Q8 obj1 = new Q8();
		Q8 obj2 = new Q8();
		Q8 obj3 = new Q8();
		Q8 obj4 = new Q8();
		System.out.println("Number of object is: "+count);
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q8.java

I:\Diwali Assignment\Class and Object>java Q8
Number of object is: 4

*/
		
		
