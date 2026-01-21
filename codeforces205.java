import java.util.*;
public class codeforces205 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            long d=sc.nextLong();
            long p=1+d;
            while(true) 
            {
                boolean isPrime=true;
                if(p<2) 
                {   
                    isPrime = false;
                }
                for(long i=2;i*i<=p;i++) 
                {
                    if(p%i==0) 
                    {
                        isPrime=false;
                        break;
                    }
                }
                if (isPrime) break;
                p++;
            }
            long q=p+d;
            while(true) 
            {
                boolean isPrime=true;
                if(q<2)
                {
                    isPrime = false;
                }
                for(long i=2;i*i<=q;i++) 
                {
                    if(q%i==0) 
                    {
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime)
                {
                    break;
                }
                q++;
            }
            long ans = Math.min(p*p*p,p*q);
            System.out.println(ans);
        }
    }
}
