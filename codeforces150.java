import java.util.*;
public class codeforces150
{
    public static void main(String args[])             // Problem 1679A. AvtoBus
{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            long n=sc.nextLong();
            if(n%2 != 0 || n<4)
            {
                System.out.println("-1");
            }
            else
            {
                long x=(n+5)/6;
                long y=n/4;
                System.out.println(x+" "+y);
            }
        }
    }
}

