// Once I am done , I will be gone , You won't see me for a while.
import java.util.*;
public class codeforces362
{
    public static void main(String args[]) 
    {                                                                  // Problem 1676H1. Maximum Crossings (Easy Version)
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
            long sum=0;
            for(int i=0;i<n-1;i++) 
            {
                for(int j=i+1;j<n;j++) 
                {
                    if(a[i]>=a[j]) 
                    {
                        sum++;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
