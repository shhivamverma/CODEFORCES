import java.util.*;
public class codeforces206
{
    public static void main(String args[])                // Problem 1305C. Kuroni and Impossible Calculation 
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        long a[]=new long[(int)n];
        for(int i=0;i<n;i++) 
        {
            a[i]=sc.nextLong();
        }
        if(n>m) 
        {
            System.out.println(0);
            return;
        }
        long prod=1;
        for(int i=0;i<n-1;i++) 
        {
            for(int j=i+1;j<n;j++) 
            {
                prod=(prod*Math.abs(a[i]-a[j]))%m;
            }
        }
        System.out.println(prod%m);
    }
}

