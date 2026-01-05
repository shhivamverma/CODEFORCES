import java.util.*;
public class codeforces168
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        for(int i=1;i<=t;i++)
        {
            long n=sc.nextLong();
            while(n%2 == 0)
            {
                n=n/2;
            }
            if(n>1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}