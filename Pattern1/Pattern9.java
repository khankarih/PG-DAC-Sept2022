class Pattern9
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print(k+ " ");
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++)
		{
			for(int l=4;l>=i;l--)
			{
				System.out.print(" ");
			}
			for(int m=6-i;m<=5;m++)
			{
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}
}

/*

I:\Diwali Assignment>javac Pattern9.java

I:\Diwali Assignment>java Pattern9
1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

*/