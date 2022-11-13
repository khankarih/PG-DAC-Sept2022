class Pattern2
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=10;k>=i*2;k--)
			{
				if(k==10 || i==1 || k==(2*i))
				{
					System.out.print("*");
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

I:\Diwali Assignment>javac Pattern2.java

I:\Diwali Assignment>java Pattern2
*********
 *     *
  *   *
   * *
    *