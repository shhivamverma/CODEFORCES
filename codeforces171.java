import java.util.*;
public class codeforces171
{
    public static void main(String args[])               // Problem 1440B. Problem of Median
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            long n=sc.nextLong();
            long k=sc.nextLong();
            long prod=n*k;
            long x=(n/2)+1;
            long arr[]=new long[(int)(n*k)];
            for(int j=0;j<n*k;j++)
            {
                arr[j]=sc.nextLong();
            }
            Arrays.sort(arr);
            long p=n*k;
            long sum=0;
            for(int j=1;j<=k;j++)
            {
                p=p-((n/2)+1);
                sum=sum+arr[(int)p];
            }
            System.out.println(sum);
        }
    }
}

