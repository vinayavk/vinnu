import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args)
	{
		String s;
		String s1;
		int diff=0;
		int i,m,n;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		s1=sc.nextLine();
		m=s.length();
		n=s1.length();
		for(i=0;i<m;++i)
		{
			if(s.charAt(i)==s1.charAt(i))
			{
				diff=diff+1;
			}
		}
		
		
		if(diff!=1)
		{
                        	System.out.println("yes");

		}
		else
		{
		 	System.out.println("no");

		}
	}
}
