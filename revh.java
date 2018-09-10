import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args)
	{
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		StringBuilder input=new StringBuilder();
		input.append(s);
		input=input.reverse();
		System.out.println(input);
	}
