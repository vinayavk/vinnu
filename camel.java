import java.util.*;
class Ideone
{
         static char[] swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }
 
    public static void main(String args[])
    {
    	String lowerCaseString="";
    	String lowerCaseString1="";
        String s;
        String s1;
        int temp,n,m,tem;
        
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();   
        s1=sc.nextLine();
        n=s.length();
        m=s1.length();
        lowerCaseString=s.toLowerCase();
       lowerCaseString1=s1.toLowerCase();

        
        for(int i=0;i<n;i++)
        {
        	    char ch[]=lowerCaseString.toCharArray();
        	   
        	    
        	    temp=(int) ch[0];
        	    temp=temp-32;
        	    ch[0]=(char) temp;
        	    System.out.print(ch[i]);
        }
        System.out.print(" ");
        for(int j=0;j<m;j++)
        {
        	char c[]=lowerCaseString1.toCharArray();
        	 
        	 tem=(int) c[0];
        	    tem=tem-32;
        	    c[0]=(char) tem;
        	   System.out.print(""+c[j]);
        

        }
       
    }
}
