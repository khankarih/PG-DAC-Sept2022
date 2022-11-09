/*Question 1:
You have been given a String S consisting of uppercase and lowercase English alphabets. You need to change the case of each 
alphabet in this String. That is, all the uppercase letters should be converted to lowercase and all the lowercase letters 
should be converted to uppercase. You need to then print the resultant String to output.*/

import java.util.Scanner;
class UpLo
{
	public static void main(String args[])
	{
		System.out.println("Input String is:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		StringBuffer strs=new StringBuffer(str);
		
		for(int i=0; i< str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				strs.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				strs.setCharAt(i,Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println("Output is:"+strs);
	}
}

/*

I:\OOPJ_220940520036>javac UpLo.java

I:\OOPJ_220940520036>java UpLo
Input String is:
abcdE
Output is:ABCDe

I:\OOPJ_220940520036>java UpLo
Input String is:
I love my India
Output is:i LOVE MY iNDIA

I:\OOPJ_220940520036>java UpLo
Input String is:
cdac@Mumbai
Output is:CDAC@mUMBAI

*/