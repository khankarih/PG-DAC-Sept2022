class Pattern12
{
	public static void main(String args[])
	{
		int letter=65;
		for(char i=0;i<=5;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(letter+j)+" ");
			}
			System.out.println();
		}
	}
}

/*

I:\Diwali Assignment>javac Pattern12.java

I:\Diwali Assignment>java Pattern12
     A
    A B
   A B C
  A B C D
 A B C D E
A B C D E F

*/