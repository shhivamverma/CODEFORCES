import java.util.*;
public class codeforces108
{
    public static void main(String args[])            // Problem 1761A. - Two Permutation.
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a+b+2<=n)
            {
                System.out.println("YES");
            }
            else if((a==b) && (a==n))
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
