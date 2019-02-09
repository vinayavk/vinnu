import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,l,j,m=0,k=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		
		}
		
		
			l=a[0];
			m=a[n-1];
		
		for(i=0;i<n;i++)
		{
			if(l<a[i])
			{
				l=a[i];
			}
			
			
		}
		for(j=n-1;j>=0;j--)
		{
			if(l!=a[j])
			{
				if(m!=l)
				{
					if(m<a[j])
					
					 m=a[j];
					 
				}
				else
				{
					break;
				}
			}
			else
			{
					k=m;
					break;
			}
			
		}System.out.println(l + " " + m);
		if(l>k)
		{
			System.out.println(l);
		}
		else
		{
			System.out.println(k);
		}
		
	} 
	
}
