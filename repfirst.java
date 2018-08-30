import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,k,x,y,t=0,count=0;
		n=sc.nextInt();
		int[] a=new int[n];
		
		for(i=0;i<n;i++)
		{
		   a[i]=sc.nextInt();
		}
		int[] r=new int[n];
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
		                          {
		                          	r[i]=a[i];
		                          	t++;
		                          
		                          }
			             	
			}		
				 
		}
		
		int[] b=new int[t];
		for(i=0;i<n;i++)
		{
		  
		  if(r[i]!=0)
		  {
		     b[i]=r[i];
		     System.out.println(b[i]);
		     break;
		  }
		}	
		
			
		
		
	}
}
