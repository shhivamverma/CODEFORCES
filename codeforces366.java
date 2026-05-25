// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codeforces366
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int c=sc.nextInt();
            int s[]=new int[n];
            for(int i=0;i<n;i++)
            {
                s[i]=sc.nextInt();
            }

            int U=((c+1)*(c+2))/2;
            int A=0;
            for(int i=0;i<s.length;i++)
            {
                A=A+(1+(int)Math.floor(s[i]/2));
            }

            int B=0;
            for(int i=0;i<s.length;i++)
            {
                B=B+(c-s[i]+1);
            }
            
            int C=0;
            int O=0;
            int E=0;

            for(int i=0;i<s.length;i++)
            {
                if(s[i]%2==0)
                {
                    E++;
                }
                else
                {
                    O++;
                }
            }
            
            C=(((O*(O+1)/2))+((E*(E+1))/2));
            int ans=U-A-B+C;
            System.out.println(ans);
        }
    }
}