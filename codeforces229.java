import java.util.*;
public class codeforces229
{
    public static void main(String args[])               // Problem 1827A. Counting Orders
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long mod=1000000007;
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int b[]=new int[n];
            for(int i=0;i<n;i++) 
            {
                b[i]=sc.nextInt();
            }
            Arrays.sort(b);
            for (int i=0;i<n/2;i++) 
            {
                int temp = b[i];
                b[i] = b[n - i - 1];
                b[n - i - 1] = temp;
            }
            long ans=1;
            for(int i=0;i<n;i++)
            {
                int l=0;
                int h=n;
                while(l<h)
                {
                    int m=(l+h)/2;
                    if(a[m]<=b[i])
                    {
                        l=m+1;
                    }
                    else
                    {
                        h=m;
                    }
                }
                int temp=l;
                long count=n-temp;
                ans=ans*Math.max(count-i,0)%mod;
            }
            System.out.println(ans);
        }
    }

}
