/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 String rev=" ";
		 int length=str.length();
		 for(int i=length-1;i>=0;i--)
		 rev=rev+str.charAt();
		 if(str.equals(rev))
		 Sytem.out.println("yes");
		 else
		 System.out.println("no");
		 
	}
}
