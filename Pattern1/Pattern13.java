class Pattern13
{
	public static void main(String args[])
	{
		int letter=64;
		int letter1=70;
		for(char i=1;i<7;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=12;k++)
			{
				if(k==1 || k==(2*i-1))
				{
					System.out.print((char)(letter+i)+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(char i=1;i<=5;i++)
		{
			for(int j=2;j<=i+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=9;k>=i;k--)
			{
				if(k==9 || k==(2*i-1))
				{
					System.out.print((char)(letter1-i)+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

/*

I:\Diwali Assignment>javac Pattern13.java

I:\Diwali Assignment>java Pattern13
     A
    B  B
   C    C
  D      D
 E        E
F          F
 E        E
  D      D
   C    C
    B  B
     A
	 
*/