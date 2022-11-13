// 13. Java Program to Create a Method without Parameters and Return Type

import java.util.Scanner;
class Q13
{
	int a,b,res;
	
	void mul()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		res=a*b;
		System.out.println("Multiplication is: "+res);
	}
	
	public static void main(String args[])
	{
		Q13 q1=new Q13();
		q1.mul();
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q13.java

I:\Diwali Assignment\Class and Object>java Q13
Enter the value of a:
10
Enter the value of b:
20
Multiplication is: 200

*/
		