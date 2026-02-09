// Once I am done , I will be gone , You wont see me for a while

import java.util.*;
public class codeforces234                                                                 // Problem 1730B. Meeting on the Line
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        while(tt-->0) 
        {
            int n=sc.nextInt();
            long x[]=new long[n];
            long t[]=new long[n];
            for(int i=0;i<n;i++) 
            {
                x[i]=sc.nextLong();
            }
            for(int i=0;i<n;i++) 
            {
                t[i]=sc.nextLong();
            }
            double be=0;
            double l=0,r=1e9;
            for(int it=0;it<=50;it++) 
            {
                double mid=(l+r)/2.0;
                double L=0,R=1e8;
                boolean flag=true;
                for(int i=0;i<n;i++) 
                {
                    double left=x[i]-Math.max(mid-t[i],0);
                    double right=x[i]+Math.max(mid-t[i],0);
                    L=Math.max(L,left);
                    R=Math.min(R,right);
                    if(R<L) 
                    {
                        flag=false;
                        break;
                    }
                }
                if(flag) 
                {
                    be=(L+R)/2.0;
                    r=mid;
                } 
                else 
                {
                    l=mid;
                }
            }
            System.out.println(be);
        }
    }
}

