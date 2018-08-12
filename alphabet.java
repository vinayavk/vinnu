import java.util.Scanner;
class ideone
{
	public static void main(String[] args)
	{
		char ch;
		char ah;
		Scanner input=new Scanner(System.in);
		ch=input.next().charAt(0);
		if(ch >= 'a' && ch <='z')
		{
		    System.out.println("Alphabet");
		}
		else
		{
			System.out.println("No");
		}
		
	}
	
}
