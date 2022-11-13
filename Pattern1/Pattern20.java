class Pattern20
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int k=i;k>1;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=7;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=6;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=7-i;j<=7;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

/*

I:\Diwali Assignment>javac Pattern20.java

I:\Diwali Assignment>java  Pattern20
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567

*/