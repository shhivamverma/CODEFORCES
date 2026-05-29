// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codeforces370
{
    public static void main(String args[])                            // Problem 1703E. Mirror Grid
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[][]=new int[n][n];
            for(int i=0;i<n;i++)
            {
                String s=sc.next();
                for(int j=0;j<n;j++)
                {
                    a[i][j]=s.charAt(j)-'0';
                }
            }
            int ans=0;
            for(int i=0;i<n/2;i++)
            {
                for(int j=i;j<n-1-i;j++)
                {
                    int x1=a[i][j];
                    int x2=a[j][n-1-i];
                    int x3=a[n-1-i][n-1-j];
                    int x4=a[n-1-j][i];
                    int ones=x1+x2+x3+x4;
                    ans=ans+Math.min(ones,4-ones);
                }
            }
            System.out.println(ans);
        }
    }
}
