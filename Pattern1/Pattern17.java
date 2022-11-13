class Pattern17
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/*

I:\Diwali Assignment>javac Pattern17.java

I:\Diwali Assignment>java Pattern17
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

*/
			
