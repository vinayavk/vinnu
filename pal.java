import java.util.*;
class Ideone
{
	public static void main(String args[])
	{
		int n,b,r=0,i,sum=0,temp;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		   
                         temp=n;    
                          while(n>0){    
                          r=n%10;  //getting remainder  
                         sum=(sum*10)+r;    
                          n=n/10;    
                          }    
                          if(temp==sum)    
                          System.out.println("yes");    
                          else    
                           System.out.println("no"); 
            }
	
} 
