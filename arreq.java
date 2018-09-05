import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,x,t=0;
		n=sc.nextInt();
		x=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[x];
		for(int i=0;i<n;i++)
		{
		      	a[i]=sc.nextInt();
		      	
		}
		
		for(int j=0;j<x;j++)
		{
		      	b[j]=sc.nextInt();
		      
		}
		for(int j=0;j<x;j++)
		{
			for(int i=0;i<n;i++)
			{
			
				if(b[j]==a[i])
				{
				   t++;
				   
				}
				
			}
		}
		if(t!=x)
  	             {
  	                 System.out.println("NO");

		        }
	            else
	            {
	                   System.out.println("YES");
	              }
		     
		
		
	}
}
