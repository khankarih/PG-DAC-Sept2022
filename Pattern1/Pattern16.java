class Pattern16
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=18;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=15;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i+2;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=12;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i+4;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=9;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i+6;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=6;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i+8;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=4;i++)
		{
			for(int j=10;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=4;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/*

I:\Diwali Assignment>javac Pattern16.java

I:\Diwali Assignment>java Pattern16
                  *
                 * *
                * * *
               * * * *
              * * * * *
               * * *
              * * * *
             * * * * *
            * * * * * *
           * * * * * * *
            * * * * *
           * * * * * *
          * * * * * * *
         * * * * * * * *
        * * * * * * * * *
         * * * * * * *
        * * * * * * * *
       * * * * * * * * *
      * * * * * * * * * *
     * * * * * * * * * * *
      * * * * * * * * *
     * * * * * * * * * *
    * * * * * * * * * * *
   * * * * * * * * * * * *
  * * * * * * * * * * * * *


          * * * *
          * * * *
          * * * *
          * * * *
		 
*/
		  