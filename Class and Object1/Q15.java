// 15. Java Program to Illustrate the Use of HashCode() Method

class Q15
{
	public static void main(String args[])
	{
		Integer i=new Integer(100);
		int hashValue=i.hashCode();
		System.out.println("The HashCode value for the object is: "+hashValue);
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q15.java

I:\Diwali Assignment\Class and Object>java Q15
The HashCode value for the object is: 100

*/