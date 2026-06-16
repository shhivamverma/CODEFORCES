// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codeforces402
{
    public static void main(String args[])                    // Problem 2044E. Insane Problem
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long k=sc.nextLong();
            long l1=sc.nextLong();
            long r1=sc.nextLong();
            long l2=sc.nextLong();
            long r2=sc.nextLong();
            long ans=0;
            long prod=1;
            while(prod<=r2) 
            {
                long l=Math.max(l1,(l2+prod-1)/prod); 
                long r=Math.min(r1,r2/prod);
                if(l<=r)
                {
                    ans=ans+(r-l+1);
                }
                if(r2/prod < k) 
                {
                    break;
                }
                prod=prod*k;
            }
            System.out.println(ans);
        }
    }
}
