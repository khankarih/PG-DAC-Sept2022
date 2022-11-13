class Pattern24
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			int a=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+ " ");
				a=a-j+6;
			}
			System.out.println();
		}
	}
}

/*

I:\Diwali Assignment>javac Pattern24.java

I:\Diwali Assignment>java Pattern24
1
2 7
3 8 12
4 9 13 16
5 10 14 17 19

*/