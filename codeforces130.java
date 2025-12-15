import java.util.*;
public class codeforces130
{
    public static void main(String args[])             // Problem 1374A. Required Remainder
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++) 
        {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long n = sc.nextLong();
            long k = n - (n - y) % x;
            System.out.println(k);
        }
    }
}

