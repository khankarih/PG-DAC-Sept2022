/*Question 2:
Write a Java Program for following Exception Handlers thrown by the code with given messages:*/

import java.util.*;

class MyException extends Exception
{
	private int detail;
	MyException(int a)
	{
		detail=a;
	}
	public String toString()
	{
		return "Myexception["+detail+"]";
	}
}

class Division
{
	static void solve(int arr[]) throws Exception
	{
			int ans=0;
			
			for(int i=0;i<10;i++)
				for(int j=i+1;j<10;j++)
					ans+=arr[i]/arr[j];
				
				throw new MyException(ans);
	}
	public static void main(String args[])
	{
			try
			{
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int []arr=new int[n];
				sc.nextLine();
				for(int i=0;i<10;i++)
				arr[i]=Integer.parseInt(sc.nextLine());
			
			String s=sc.nextLine();
			System.out.println(s.charAt(10));
			
			solve(arr);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Index is invalid");
			}
			catch(NumberFormatException e)
			{
				System.out.println("Format Mismatch");
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("Index is Invalid");
			}
			catch(ArithmeticException e)
			{
				System.out.println("Invalid Divison");
			}
			catch(MyException e)
			{
				System.out.println(e);
			}
			catch(Exception e)
			{
				System.out.println("Exception Encountered");
			}
			finally
			{
				System.out.println("Exception Handling Completed");
			}
	}
}


/*

Test case 1:

I:\OOPJ_220940520036>javac Division.java

I:\OOPJ_220940520036>java Division
10
10
9
8
7
6
5
4
3
2
1
exceptionhandlingtime
a
Myexception[117]
Exception Handling Completed

Test case 2:

I:\OOPJ_220940520036>java Division
9
1
2
3
4
5
6
7
8
9
string
Format Mismatch
Exception Handling Completed

Test case 3:

I:\OOPJ_220940520036>java Division
10
10
9
8
7
6
5
4
3
2
1
string
Index is Invalid
Exception Handling Completed

*/
	
	
			
		