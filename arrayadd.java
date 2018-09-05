import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				
				
				for(int k=j+1;k<n;k++)
				{
					if(a[i]+a[j]==a[k])
					{
					System.out.println(a[i]+" "+a[j]+" "+a[k]);	
					}
				}
				
			}
		}
	}
}
