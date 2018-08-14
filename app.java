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
		String s;
		Scanner input=new Scanner(System.in);
	            s=input.nextLine();
	            
	            
	            
	            System.out.println(s.concat("."));
	            input.close();
	}
}
