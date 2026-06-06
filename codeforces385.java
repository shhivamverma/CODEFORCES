// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codeforces385
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long a[]=new long[n+1];
            long sum=0;
            for(int i=1;i<=n;i++)
            {
                a[i]=sc.nextLong();
                sum=sum+a[i];
            }
            long mins[]=new long[n+2];
            Arrays.fill(mins,Long.MAX_VALUE);
            for(int i=n;i>=1;i--)
            {
                mins[i]=Math.min(mins[i+1],a[i]);
            }
            long fixed=0;
            long moves=0;
            for(int i=n;i>=1;i--)
            {
                fixed=fixed+mins[i];
            }

            HashMap<Long, Integer> mp=new HashMap<>();
            for(int i=1;i<=n;i++)
            {
                mp.put(mins[i], mp.getOrDefault(mins[i], 0)+1);
                moves=Math.max(moves,mp.getOrDefault(a[i], 0));
            }
            long ans=sum-fixed+Math.max(0,moves-1);
            System.out.println(ans);
        }
    }
}

        