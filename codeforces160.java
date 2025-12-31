import java.util.*;
public class codeforces160
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        for(int i=1;i<=t;i++)
        {
            long n=sc.nextLong();
            long arr[]=new long[(int)n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextLong();
            }
            long cnt1=0;
            long cnt0=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j] == 1)
                {
                    cnt1++;
                }
                if(arr[j] == 0)
                {
                    cnt0++;
                }
            }
            System.out.println(cnt1*((long)Math.pow(2,cnt0)));
        }
    }
}