import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args)
	{
		
		int i,m,n;
		
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		int arr[]=new int[m];
		for(i=0;i<m;i++)
		{
		    arr[i]=sc.nextInt();
		
		}
		for(int j=0;j<n;j++)
		{
			int a=arr[m-1];
			for(i=m-1; i>0; i--)
			{
			  
			   arr[i]=arr[i-1];
			}
			   arr[0]=a;
			   
			   
			
		}
	            for(i=0;i<m;i++)
	            {
	            	System.out.print(arr[i]+" ");
	            }
		
		
	
		
	}

	
}
