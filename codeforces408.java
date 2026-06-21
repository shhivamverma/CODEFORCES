// Once I am done , I will be gone ,                       SHIUVAM

import java.util.*;
public class codeforces408
{
    public static void main(String args[])                           // Problem - 2237D. Fullmetal Bitchemist 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            String s=sc.next();
            long ans=0;
            long alt=0;
            long dp[]=new long[3];
            for(int i=0;i<n;i++) 
            {
                long temp[]=dp.clone();
                if(s.charAt(i)=='1') 
                {
                    temp[0]=dp[2];
                    temp[1]=dp[0]+1;
                    temp[2]=dp[1];
                } 
                else 
                {
                    temp[0]=dp[1];
                    temp[1]=dp[2];
                    temp[2]=dp[0]+1;
                }
                dp=temp;
                if(i>0 && s.charAt(i)!=s.charAt(i-1)) 
                {
                    alt++;
                } 
                else 
                {
                    alt=1;
                }
                ans=ans+dp[1]+dp[2]-(alt-1)/2;
            }
            System.out.println(ans);
        }
    }
}
