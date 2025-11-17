import java.util.*;
public class codeforces97
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        for(int i=1;i<=t;i++)
        {
            long n=sc.nextLong();
            long k=sc.nextLong();
            if(n%2==0 || (n-k)%2==0)
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