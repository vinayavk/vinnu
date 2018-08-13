import java.util.*;
class Ideone
{
	public static void main(String args[])
	{
		int n,b,r=0,i; boolean flag=false;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		for(i=2;i<n/2;i++)
		{
		    if(n%i==0)
		    {
		      flag=true;
		      break;
		    }
		}
		 if(!flag)
		    {
		      System.out.println("yes");
		    }
		  else
		    {
		    	System.out.println("no");
		    }
		
            }
	
} 
