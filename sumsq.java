import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args)
	{
		int n,a,r=0,m;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
		   
		    a=n%10;
		    m=a*a;
		    r=r+m;
		    n=n/10;
		    
		}
		System.out.println(r);
	}
}
