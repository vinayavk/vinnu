import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args)
	{
	     int n;
	     int i;
	     
	     String s="";
	     
	     Scanner sc=new Scanner(System.in);
	     n=sc.nextInt();
	     for(i=0;i<n;i++)
	     {
	       s=sc.nextLine();
	       String ch=s.replaceAll("[aeiouAEIOU]","");
	       
	       
	       StringBuilder input=new StringBuilder();
	       input.append(ch);
	       input=input.reverse();
	       System.out.print(input);
	 
	     }
	
	     
	      
	}
}
