// Once I am done , I will be gone , You wont see me for a while

import java.util.*;
public class codeforces232
{
    public static long gcd(long a, long b)                                    // Problem 1982D. Beauty of the mountains
    {
        while(b!=0) 
        {
            long temp=b;
            b=a%b;
            a=temp;
        }
        return Math.abs(a);
    }
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            long a[][]=new long[n][m];
            for(int i=0;i<n;i++) 
            {
                for(int j=0;j<m;j++) 
                {
                    a[i][j]=sc.nextLong();
                }
            }
            String s[]=new String[n];
            for(int i=0;i<n;i++) 
            {
                s[i]=sc.next();
            }
            long p[][]=new long[n][m];
            for(int i=0;i<n;i++) 
            {
                if(s[i].charAt(0)=='1')
                {
                    p[i][0]=1;
                }
                else
                {
                    p[i][0]=-1;
                }
                for(int j=1;j<m;j++) 
                {
                    if(s[i].charAt(j)=='1')
                    {
                        p[i][j]=p[i][j-1]+1;
                    }
                    else
                    {
                        p[i][j]=p[i][j-1]-1;
                    }
                }
            }
            for(int j=0;j<m;j++) 
            {
                for(int i=1;i<n;i++) 
                {
                    p[i][j]=p[i][j]+p[i-1][j];
                }
            }
            long g=0;
            for(int i=0;i+k-1<n;i++) 
            {
                for(int j=0;j+k-1<m;j++) 
                {
                    long val=p[i+k-1][j+k-1];
                    if(i>0) 
                    val=val-p[i-1][j+k-1];
                    if(j>0) 
                    val=val-p[i+k-1][j-1];
                    if(i>0&&j>0) 
                    val=val+p[i-1][j-1];
                    g=gcd(g,Math.abs(val));
                }
            }
            long di=0;
            for(int i=0;i<n;i++) 
            {
                for(int j=0;j<m;j++) 
                {
                    if(s[i].charAt(j)=='1')
                    {
                        di=di+a[i][j];
                    }
                    else
                    {
                        di=di-a[i][j];
                    }
                }
            }
            di=Math.abs(di);
            if(di == 0) 
            {
                System.out.println("YES");
            } 
            else if 
            (g != 0 && di % g == 0) 
            {
                System.out.println("YES");
            } 
            else 
            {
                System.out.println("NO");
            }
        }
    }
}

