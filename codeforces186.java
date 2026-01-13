import java.util.*;
public class codeforces186
{
    public static void main(String args[])            //  Problem 1765M. Minimum LCM
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a=1;
            int b=n-1;
            for(int i=2;i*i<=n;i++)
            {
                if(n%i==0)
                {
                    a=n/i;
                    b=n-a;
                    break;
                }
            }
            System.out.println(a+" "+b);
        }
    }

}
