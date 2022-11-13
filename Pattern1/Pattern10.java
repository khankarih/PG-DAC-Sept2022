class Pattern10
{
	public static void main(String args[])
	{
		int letter=65;
		for(char i=0;i<6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(letter+i)+" ");
			}
			System.out.println();
		}
	}
}


/*

I:\Diwali Assignment>javac Pattern10.java

I:\Diwali Assignment>java Pattern10
A
B B
C C C
D D D D
E E E E E
F F F F F F

*/