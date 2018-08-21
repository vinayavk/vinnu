import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) 
	{
		int n,r=0,count=1,i; 
		int flag=1;
	          
		
		Scanner sc=new Scanner(System.in);

		n=sc.nextInt();
		
		int[] m=new int[n];
		for(i=0;i<n;i++)
		{
		   m[i]=sc.nextInt();
		   
		}
		for(i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(m[i]==m[j] && i!=j)
				{
				   flag=0;
				   break;
		          		}
		          		else
		          		{
		          			flag=1;
		          		}
				
			}
		if(flag==1)
		{
		   System.out.println(m[i]);	
		}
		}
	}
}
