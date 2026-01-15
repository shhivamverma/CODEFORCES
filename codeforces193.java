import java.util.*;
public class codeforces193
{
    public static void main(String args[])                // Problem 1704B. Luke is a Foodie

    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            long x=sc.nextLong();
            long arr[]=new long[(int)n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextLong();
            }
            long range[][]=new long[(int)n][2];
            for(int i=0;i<n;i++)
            {
                range[i][0]=arr[i]-x;
                range[i][1]=arr[i]+x;
            }
            long ans=0;
            long l=range[0][0];
            long r=range[0][1];
            for(int i=1;i<n;i++)
            {
                l=Math.max(l,range[i][0]);
                r=Math.min(r,range[i][1]);
                if(l>r)
                {
                    ans++;
                    l=range[i][0];
                    r=range[i][1];
                }
            }
            System.out.println(ans);
        }
    }

}
