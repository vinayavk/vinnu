import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) 
	{
		int m,n; 
		String s;
		String s1;
		char ch=0;
		int count=1,max=0;
		Scanner sc=new Scanner(System.in);

		s=sc.nextLine();
		
		n=s.length();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			     if(s.charAt(i)==s.charAt(j))
			     {
			     	count=count+1;

			     	if(count>max)
			     	{
			     	    max=count;
			     	    ch=s.charAt(i);
			     	    
			     	}
			     }	
			     	
			}
			
		   
		   
		}System.out.println(ch);
	}
}
