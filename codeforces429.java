// Once I am done , I will be gone , You won't see me for a while.

//  ███████╗ ██╗  ██╗ ██╗ ██╗   ██╗  █████╗  ███╗   ███╗
//  ██╔════╝ ██║  ██║ ██║ ██║   ██║ ██╔══██╗ ████╗ ████║
//  ███████╗ ███████║ ██║ ██║   ██║ ███████║ ██╔████╔██║
//  ╚════██║ ██╔══██║ ██║ ╚██╗ ██╔╝ ██╔══██║ ██║╚██╔╝██║
//  ███████║ ██║  ██║ ██║  ╚████╔╝  ██║  ██║ ██║ ╚═╝ ██║
//  ╚══════╝ ╚═╝  ╚═╝ ╚═╝   ╚═══╝   ╚═╝  ╚═╝ ╚═╝     ╚═╝

import java.util.*;
public class codeforces429
{
    public static void main(String args[])                                     // Problem - 1808B. Playing in a Casino
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            ArrayList<Long> a[]=new ArrayList[m];
            for(int i=0;i<m;i++)
            {
                a[i]=new ArrayList<>();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    Long x=sc.nextLong();
                    a[j].add(x);
                }
            }
            for(int i=0;i<m;i++)
            {
                Collections.sort(a[i]);
            }
            long ans=0;
            for(int i=0;i<m;i++)
            {
                long sum[]=new long[(int)n];
                sum[n-1]=a[i].get(n-1);
                for(int j=n-2;j>=0;j--)
                {
                    sum[j]=sum[j+1]+a[i].get(j);
                }
                for(int j=0;j<n-1;j++)
                {
                    ans=ans+sum[j+1]-((n-1-j)*a[i].get(j));
                }
            }
            System.out.println(ans);
        }
    }
}
