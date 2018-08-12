import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args)
	{
	    char ch;
	    int i;
	    
	    Scanner input= new Scanner(System.in);
	    ch=input.next().charAt(0);
	   switch(ch)
	   {
	   	case 'a':
	            case 'e':
	   	case 'i':
	            case 'o':
	            case 'u':
	                      System.out.println("Vowel");
	                break;
	            case 'b':
	            case 'c':
	            case 'd':
	            case 'f':
	            case 'g':
	            case 'h':
	            case 'j':
	            case 'k':
	            case 'l':
	            case 'm':
	            case 'n':
	            case 'p':
	            case 'q':
	            case 'r':
	            case 's':
	            case 'v':
	            case 'w':
	            case 'x':
	            case 'y':
	            case 'z':
	                     System.out.println("Consonant");
	            break;
	            default:
	                     System.out.println("invalid");
	   }
	}
}
