import java.util.*;
public class codeforces231
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long k=sc.nextLong();
            Long q[]=new Long[n];
            for(int i=0;i<n;i++)
            {
                q[i]=sc.nextLong();
            }
            long r[]=new long[n];
            for(int i=0;i<n;i++)
            {
                r[i]=sc.nextLong();
            }
            Arrays.sort(q,Collections.reverseOrder());
            Arrays.sort(r);
            int ptr=0;
            int ans=0;
            for(int i=0;i<n&&ptr<n;i++)
            {
                long c=r[ptr];
                if((q[i]*(c+1)+c)<=k)
                {
                    ans++;
                    ptr++;
                }
            }
            System.out.println(ans);
        }
    }
}