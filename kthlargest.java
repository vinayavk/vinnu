import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n,k,m=0,y;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    k=sc.nextInt();
	    
	    int[] a=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    Arrays.sort(a);
	    for(int j=0;j<n;j++)
	    {
	      if(m<a[j])
	      {
	      	m=a[j];
	      }
	       
	    	
	    	
	    }
	    for(int x=0;x<n;x++)
	    {
	    	if(m==a[x])
	    	{
	    		y=a[x-k+1];
	    	   System.out.println(y);	
	    	}
	    }
	    
	   
	}
}
