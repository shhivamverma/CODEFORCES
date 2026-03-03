// Once I am done , I will be gone , You wont see me for a while

import java.util.*;
public class codeforces269
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long r=sc.nextLong();
            long s=0;
            for(long x=1;x<=r;x++)
            {
                long outer=(r+1)*(r+1)-(x*x);
                long inner=(r)*(r)-(x)*(x);
                long up=(long)Math.ceil(Math.sqrt(outer)-1);
                long down=(long)Math.ceil(Math.sqrt(inner));
                s=s+(up-down+1);
            }
            System.out.println(s*4);
        }
    }
}