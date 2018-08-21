import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) 
	{
		int n,r=0,count=1,i,temp; 
		int flag=1;
	          
		
		Scanner sc=new Scanner(System.in);

		n=sc.nextInt();
		
		int[] m=new int[n];
		for(i=0;i<n;i++)
		{
		   m[i]=sc.nextInt();
		   
		}
		for (i = 0; i < n; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				if(m[i] < m[j])
				{
					temp = m[i];
					m[i] = m[j];
					m[j] = temp;
					
				}		
			}
		}
		for (i = 0; i < n; i++)
		{
			System.out.print(m[i]);
			
		}
					
		
	}
}
