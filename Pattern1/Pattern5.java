class Pattern5
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++)
		{
			for(int j=4-i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int k=2;k<=4-i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}


/*


I:\Diwali Assignment>javac Pattern5.java

I:\Diwali Assignment>java Pattern5
1
212
32123
4321234
32123
212
1


*/