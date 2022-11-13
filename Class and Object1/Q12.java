// 12. Java Program to Create a Method without Parameters and with Return Type

import java.util.Scanner;
class Q12
{
	int a;
	int b;
	int res;
	
	int sub()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		res=a-b;
		return res;
	}
	
	public static void main(String args[])
	{
		Q12 q1=new Q12();
		System.out.println("Substraction is: "+q1.sub());
	}
}

/*

I:\Diwali Assignment\Class and Object>javac Q12.java

I:\Diwali Assignment\Class and Object>java Q12
Enter the value of a:
10
Enter the value of b:
5
Substraction is: 5

*/