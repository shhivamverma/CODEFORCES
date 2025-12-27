import java.util.*;
public class codeforces148
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            long n=sc.nextLong();
            long arr[]=new long[(int)n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextLong();
            }
            long ans=arr[(int)n-1] - arr[0];
            for (int j=1;j<n;j++) 
            {
				ans=Math.max(ans,arr[j]-arr[0]);
			}
            for (int j=0;j<n-1;j++)
            {
				ans=Math.max(ans,arr[(int)n-1]-arr[j]);
			}
            for (int j=0;j<n-1;j++)
            {
				ans=Math.max(ans,arr[j]-arr[j+1]);
			}
            System.out.println(ans);
        }
    }
}