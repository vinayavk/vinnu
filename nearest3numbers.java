import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args)
	{
		int n,k,i,j,l,len=0,length=0,m;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int[] c=new int[n];
		int[] d=new int[n];
		int[] e=new int[n];
		int[] p=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<n;i++)
		{
			if(k==a[i])
			{
			    for(j=i+1;j<n;j++)
			    {
			    
			     
				    if(k<a[j] || k>a[j])
				     {
					    b[j]=a[j];
				     }
			    }
			    
			}
		}
		for(i=0;i<n;i++)
		{
			if(k==a[i])
			{
				for(l=i-1;l>=0;l--)
			    {
			    	
			    	if(k<a[l] || k>a[l])
			    	{
			    		c[l]=a[l];
			    	
			    	}
			    }
			}
		}  
		for(i=0;i<n;i++)
		{
		
		   if(c[i]!=0)
		   {
		   	 length=length+1;
		   }
		}
		for(i=0;i<length;i++)
		{
			for(j=0;j<n;j++)
			{
				
				if(c[j]!=0)
				{
					e[i]=c[j];
					
					i=i+1;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			
			    if(b[i]!=0)
			     {
			     	len=len+1;
			     }
			     
			
		}
		for(i=0;i<len;i++)
		{
			for(j=0;j<n;j++)
			{
			    if(b[j]!=0)
			     {
			     	
				   d[i]=b[j];
				   i=i+1;
			     }
			}
		}
		
		
		m=len+length;
		
	
			        System.arraycopy(e, 0, p, 0, length);
        System.arraycopy(d, 0, p, length, len);
			for(i=0;i<3;i++)
			{
				System.out.println(p[i]);
			}
	
	}
}
