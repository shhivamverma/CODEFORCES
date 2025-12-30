import java.util.*;
public class codeforces158
{
    public static void main(String args[])                        // Problem 1606A. AB Balance
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=t;i++)
        {
            String s=sc.nextLine();
            int n=s.length();
            if(s.charAt(0) == (s.charAt(n-1)))
            {
                System.out.println(s);
            }
            else
            {
                if(s.charAt(0) == 'b')
                {
                    s='a'+s.substring(1);
                }
                else
                {
                    s='b'+s.substring(1);
                }
                System.out.println(s);
            }
        }
    }

}
