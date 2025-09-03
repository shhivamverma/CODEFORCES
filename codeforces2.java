import java.util.*;
public class codeforces2
{
    public static void main(String args[])
    {        
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();   
        sc.nextLine();          
        String str = sc.nextLine();  
        int n1=str.length();
        int c=0;
        for(int i=0;i<n1-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}