import java.util.*;
class Ideone
{
	public static void main(String args[])
	{
		int a,count=0;
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		while(a != 0)
                         {
            
                            a /= 10;
                            ++count;
                           }

                            System.out.println(count);
              }
	
} 
