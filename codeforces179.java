import java.util.*;
public class codeforces179
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            long p=sc.nextLong();
            long a[]=new long[n];
            long b[]=new long[n];
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextLong();
            }
            for(int i=0;i<n;i++)
            {
                b[i] = sc.nextLong();
            }
            Integer[] idx = new Integer[n];
            for(int i=0;i<n;i++) 
            {
                idx[i]=i;
            }
            Arrays.sort(idx, (i, j) -> Long.compare(b[i], b[j]));
            long cost = p;      
            long told = 1; 
            for (int k=0;k<n;k++)
            {
                int i=idx[k];
                if(b[i] >= p)
                { 
                    break;
                }
                long canShare=a[i];
                if (told + canShare >= n)
                {
                    cost = cost + (n - told) * b[i];
                    told = n;
                    break;
                } 
                else 
                {
                    cost = cost + canShare * b[i];
                    told = told + canShare;
                }
            }
            cost = cost + (n - told) * p;
            System.out.println(cost);
        }
    }
}
