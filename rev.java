import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static int factorial(int n)
	{
		if(n==0)
		return 1;
		else
		return(n*factorial(n-1));
	}
	public static void main (String[] args)
	{
		int n,a=0,r;
		Scanner input=new Scanner(System.in);
	            n=input.nextInt();
	            while(n>0)
	            {
	            	r=n%10;
	            	a=a*10+r;
	            	n=n/10;
	            	
	            }
	            System.out.println(a);
	}
}
