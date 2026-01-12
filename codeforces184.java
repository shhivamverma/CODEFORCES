import java.util.*;
public class codeforces184
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            long a[]=new long[(int)n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
            }
            long b[]=new long[(int)n];
            for(int i=0;i<n;i++)
            {
                b[i]=sc.nextLong();
            }
            long countA[]=new long[(int)((2*n)+1)];
            long countB[]=new long[(int)((2*n)+1)];
            long count=1;
            for(int i=1;i<n;i++)
            {
                if(a[i]==a[i-1])
                {
                    count++;
                }
                else
                {
                    countA[(int)a[i-1]]=Math.max(count,countA[(int)a[i-1]]);
                    count=1;
                }
            }
            countA[(int)a[(int)(n-1)]]=Math.max(count,countA[(int)a[(int)(n-1)]]);
            count=1;
            for(int i=1;i<n;i++)
            {
                if(b[i]==b[i-1])
                {
                    count++;
                }
                else
                {
                    countB[(int)b[i-1]]=Math.max(count,countB[(int)b[i-1]]);
                    count=1;
                }
            }
            countB[(int)b[(int)(n-1)]]=Math.max(count,countB[(int)b[(int)(n-1)]]);
            long max=-1;
            for (int i = 1; i <= 2 * n; i++) 
            {
				max = Math.max(max, countA[i] + countB[i]);
			}
            System.out.println(max);
        }
    }
}