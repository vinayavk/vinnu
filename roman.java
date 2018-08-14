import java.util.*;
class Ideone
{
	static int no(char s)
	{
			if(s=='I') return 1;
		if(s=='V') return 5;
		if(s=='X') return 10;
		if(s=='L') return 50;
		if(s=='C') return 100;
		if(s=='M') return 500;
		if(s=='D') return 1000;
		return -1;
	
	}
           static int  sol(String s)
	{
		int len=s.length();
		int r=0;
		for(int i=0;i<len;i++)
		{
			int s1=no(s.charAt(i));
			if(i+1<len)
			{
				int s2=no(s.charAt(i+1));
				if(s1>=s2)
				{
					r=r+s1;
				}
				else
				{
					r=r+s2-s1;
					i++;
				}
				}
			else
			{
				r=r+s1;
				i++;
			}
		}
		return r;
	}
	public static void main (String[] args)
	{
		Scanner inp=new Scanner(System.in);
		
		String s=inp.nextLine();
		int st=sol(s);
		System.out.println(st);
	}
}
