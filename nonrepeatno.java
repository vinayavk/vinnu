import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args)
	{
                int i,j,n;
                Scanner sc=new Scanner(System.in);
                n=sc.nextInt();
                int[] m=new int[n];
                for(i=0;i<n;i++)
                {
                	m[i]=sc.nextInt();
                }
                Arrays.sort(m);
                for(i=0;i<n;i++)
                {
                	int flag=0;
                	for(j=i+1;j<n;j++)
                	{
                		
                		if(m[i]!=m[j])
                		{
                		   flag=1;
                		   break;
                		}
                	}
                	if(flag==0)
                	{
                		System.out.println(m[i]);
                	}
                }
	}
}
