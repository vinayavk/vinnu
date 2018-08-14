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
		int n,i,r=1;
		Scanner input=new Scanner(System.in);
	            n=input.nextInt();
	            r=factorial(n);
	            System.out.println(r);
	}
}
