// 26. Java Program to Calculate Sum of Two Byte Values using Type Casting

import java.util.Scanner;
class Q26
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first value: ");
		byte a=sc.nextByte();
		int x=a;
		
		System.out.println("Enter the Second value: ");
		byte b=sc.nextByte();
		int y=b;
		
		int c=x/y;
		System.out.println("Division is: "+c);
	}
		
}

/*

I:\Diwali Assignment\Class and Object>javac Q26.java

I:\Diwali Assignment\Class and Object>java Q26
Enter the first value:
90
Enter the Second value:
18
Division is: 5

*/