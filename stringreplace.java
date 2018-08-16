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
        String s;
        int n,i;
        char temp;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();    
        n=s.length();
        for(i=0;i<n;i=i+2)
        {   
        	
        	char ch[]=s.toCharArray();
        	temp=ch[i];
        	ch[i]=ch[i+1];
        	ch[i+1]=temp;
        	
        	
          
        System.out.print(ch[i]+""+ch[i+1]);
        }
        
 
    }
}
