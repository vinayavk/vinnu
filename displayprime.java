import java.util.*;
class Ideone
{
	public static void main(String args[])
	{
		int a,b,r=0,i; boolean flag=false;
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		while (a < b) {
                       flag = false;

                          for(i = 2;i<= a/2; ++i) {
                
                            if(a % i == 0) {
                               flag = true;
                            break;
                             }
                            }
		
                          if (!flag)
                           System.out.print(a + " ");

                          ++a;
		}
            }
	
} 
