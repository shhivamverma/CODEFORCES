import java.util.*;
public class codeforces143
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            long n=sc.nextLong();
            long k=sc.nextLong();
            long a[]=new long[(int)n];
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextLong();
            }
            Arrays.sort(a);
            long count=1;
            long longcount=1;
            long max=0;
            for(int j=1;j<n;j++)
            {
                
                if(a[j]-a[j-1] <= k)
                {
                    count++;
                }
                else
                {
                    count=1;
                }
            longcount=Math.max(longcount,count);
            }
           
            System.out.println(n-longcount);
        }
    }
}