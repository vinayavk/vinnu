import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,k,x,y,r,t=1,count=0;
		n=sc.nextInt();
		int[] a=new int[n];
		int temp=n;
		while(temp!=0)
		{
			temp/=10;
			count++;
			
		}
		i=count-1;
		while(n!=0)
		{
			r=n%10;
			a[i]=r;
			i--;
			n/=10;
		}
		for(i=0;i<count;i++)
		{
			System.out.printf("%c",(a[i]+96));
		}
		System.out.println("");
		for(j=2;j<count;j+=2)
		{
			for(i=0,k=j;k<count;i++,k++)
			{
				for(x=0;x<i;x++)
				System.out.printf("%c",(a[x]+96));
				for(y=0;y<j;y+=2,x+=2)
				{
					temp=(a[x]*10)+a[x+1];
					if(temp<=26 && temp>0)
					{
						System.out.printf("%c",(temp+96));
						t++;
					}
				}
				for(;x<count;x+=2)
				{
					System.out.printf("%c",(a[x]+96));
				}System.out.println("");
			}
		}System.out.println("");
		System.out.println(t);
	}
}
