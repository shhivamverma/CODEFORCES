// Once I am done , I will be gone , You wont see me for a while

import java.util.*;
public class codeforces270
{
    static final long MOD=1000000007;
    static final int N=200000;
    static long fact[]=new long[N+5];
    static long inv[]=new long[N+5];
    static long C(int n,int r)
    {
        if(r>n)
        {
            return 0;
        }
        else
        {
            return fact[n]*inv[n-r]%MOD*inv[r]%MOD;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        fact[0]=fact[1]=1;
        inv[0]=inv[1]=1;
        for(int i=2;i<=N;i++)
        {
            fact[i]=fact[i-1]*i%MOD;
            inv[i]=(MOD-MOD/i)*inv[(int)(MOD%i)]%MOD;
        }
        for(int i=1;i<=N;i++)
        {
            inv[i]=inv[i-1]*inv[i]%MOD;
        }
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int ones=0;
            for(int i=1;i<=n;i++)
            {
                int a=sc.nextInt();
                if(a==1)
                {
                    ones++;
                }
            }
            int req=(k+1)/2;
            long ans=0;
            for(int i=req;i<=k;i++)
            {
                long ways=C(ones,i)*C(n-ones,k-i)%MOD;
                ans=(ans+ways)%MOD;
            }
            System.out.println(ans);
        }
    }
}