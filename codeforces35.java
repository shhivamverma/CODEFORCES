import java.util.*;
public class codeforces35                                   // Problem 1900A - Cover In Water
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(); 
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt(); 
            String s=sc.next();
            if (s.contains("...")) 
            {
                System.out.println(2);
            } 
            else 
            {
                int count=0;
                for(int j=0;j<s.length();j++) 
                {
                    if(s.charAt(j)=='.')
                    { 
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
