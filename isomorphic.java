import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	
	public static void main (String[] args) 
	{
	   String s;
	   String s1;
	   int m=0,k=0;
	   Scanner sc=new Scanner(System.in);
	   
	   s=sc.nextLine();
	   s1=sc.nextLine();
	   int n=s.length();
	   for(int i=0;i<n;i++)
	   {
	   	for(int j=i+1;j<n;j++)
	   	{
	   		if(s.charAt(i)==s.charAt(j))
	   		{
	   			 m=i;
	   			 k=j;
	   		}
	   	}
	   	if(s1.charAt(m)==s1.charAt(k))
	   	{
	   		System.out.println("yes");
	   		break;
	   		
	   	}
	   	else
	   	{
	   		System.out.println("no");
	   		break;
	   	}
	   
	   
	   }
	}
}
