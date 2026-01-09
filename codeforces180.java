import java.util.*;
public class codeforces180
{
    public static void main(String args[])                       // Problem 1859B. Olya and Game with Arrays
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            long b[]=new long[n];
            long first=Long.MAX_VALUE;
            for (int i=0;i<n;i++) 
            {
                int m=sc.nextInt();
                long a[]=new long[m];
                for(int j=0;j<m;j++)
                {
                    a[j]=sc.nextLong();
                }
                Arrays.sort(a);
                b[i] = a[1];
                if(a[0]<first)
                {
                    first=a[0];
                }
            }
            Arrays.sort(b);
            long sum=0;
            for (int i=0;i<n;i++) 
            {
                sum=sum+b[i];
            }
            long ans=first+sum-b[0];
            System.out.println(ans);
        }
    }
}

