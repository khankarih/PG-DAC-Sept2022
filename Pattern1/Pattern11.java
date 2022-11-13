class Pattern11
{
	public static void main(String args[])
	{
		int letter=65;
		for(char i=0;i<=6;i++)
		{
			for(int j=0;j<=6-i;j++)
			{
				System.out.print((char)(letter+j)+" ");
			}
			System.out.println();
		}
		for(char i=0;i<=6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(letter+j)+" ");
			}
			System.out.println();
		}
	}
}

/*

I:\Diwali Assignment>javac Pattern11.java

I:\Diwali Assignment>java Pattern11
A B C D E F G
A B C D E F
A B C D E
A B C D
A B C
A B
A
A
A B
A B C
A B C D
A B C D E
A B C D E F
A B C D E F G

*/