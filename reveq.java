import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n,k,m=0,y;
	    Scanner sc=new Scanner(System.in);
	    String s;
	    String s1;
	    
	    s=sc.nextLine();
	    s1=s;
	    StringBuilder input=new StringBuilder();
	    input.append(s);
	    input=input.reverse();
	    StringBuilder input1=new StringBuilder();
	    input1.append(s1);
	    
	    if(input.toString().equals(input1.toString()))
	    {
	    	System.out.println("YES");
	    	
	    }
	    else
	    {
	    	System.out.println("NO");
	    }
	    
	   
	    
	   
	}
}
