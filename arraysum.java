import java.util.*;
import java.util.Arrays;
class Ideone
{
	public static void main(String args[])
	{
		int a,b,i,sum=0;
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		
		int[] data=new int[a];
		 
		for(i=0;i<a;i++)
		{
		    int value=input.nextInt();
		    data[i]=value;
		}
		for(i=0;i<b;i++)
		{
			sum=sum+data[i];
		}
		System.out.println(sum);
		input.close();
	}
} 
