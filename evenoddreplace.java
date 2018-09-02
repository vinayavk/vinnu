import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args)
	{
		int n,i,j,k,temp,x;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(j=0,i=1;j<n;j+=2,i+=2)
	            {
	            	x=a[j]%2;
			if(x!=0)
			{
				System.out.print(a[j]);
				System.out.print(" ");

			}
			temp=a[i]%2;
			if(temp==0)
			{
				System.out.print(a[i]);
				System.out.print(" ");

			}
		 
	            
	              
	            }
	}
}
