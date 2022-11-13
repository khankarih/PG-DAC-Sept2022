class Pattern18
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=7;j>=8-i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

/*

I:\Diwali Assignment>javac Pattern18.java

I:\Diwali Assignment>java Pattern18
7
76
765
7654
76543
765432
7654321

*/