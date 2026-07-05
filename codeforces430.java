import java.util.*;
public class codeforces430
{
    static final long MOD=1000000007L;
    static long power(long base,long x)                                // Problem - 584B. Kolya and Tanya
    {
        long ans=1;
        base=base%MOD;
        while(x>0) 
        {
            if(x%2==0) 
            {
                base=(base*base)%MOD;
                x=x/2;
            }
            else 
            {
                ans=(ans*base)%MOD;
                x--;
            }
        }
            return ans;
    }
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long anss=(power(3,3*n)-power(7,n)+MOD)%MOD;
        System.out.println(anss);
    }
}
