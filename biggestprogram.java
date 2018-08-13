import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) 
	{
	          int a,b,c;
	          Scanner input=new Scanner(System.in);
	          a=input.nextInt();
	          b=input.nextInt();
	          c=input.nextInt();
	          if(a>=b && a>=c)
	          {
	          	System.out.println(a);
	          }
	          else if(b>=a && b>=c)
	          {
	          	System.out.println(b);
	          }
	          else
	          {
	          	System.out.println(c);
	          }
	}
}
