// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codeforces413
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextInt();
            long a=-1;
            long b=-1;
            long c=-1;
            for(long i=2;i*i<=n;i++)
            {
                if(n%i==0)
                {
                    a=i;
                    n=n/i;
                    break;
                }
            }
            if(a!=-1) 
            { 
                for(long i=2;i*i<=n;i++) 
                { 
                    if(n%i==0 && i!=a) 
                    { 
                        b=i; 
                        c=n/i; 
                        break; 
                    } 
                } 
            } 
            if(a!=-1 && b!=-1 && c>1 && c!=a && c!=b) 
            { 
                System.out.println("YES"); 
                System.out.println(a+" "+b+" "+c); 
            } 
            else 
            { 
                System.out.println("NO"); 
            } 
        }
    }
}