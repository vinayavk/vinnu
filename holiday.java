import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args)
	{
		String s;
		String s1;
		int diff=0;
		int i,m,n;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		switch(s)
		{
			case "Monday":
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
			case "Friday":
			case "Saturday":
			     System.out.println("no");
			     break;
			case "Sunday":
				System.out.println("yes");
				break;
		}
	}
}
