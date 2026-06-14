// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codeforces399
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++) 
            {
                a[i]=sc.nextInt();
            }
            int ans[]=new int[n];
            boolean f=true;
            for(int b=0;b<9;b++) 
            {
                int x=-1;
                int y=n;
                for(int i=0;i<n;i++) 
                {
                    if (a[i]==-1)
                    { 
                        continue;
                    }
                    if(((a[i]>>b)&1)==0) 
                    {
                        x=i;
                    } 
                    else 
                    {
                        y=Math.min(y,i);
                    }
                }
                if(x>=y) 
                {
                    f=false;
                    break;
                }
                for(int i=x+1;i<n;i++) 
                {
                    ans[i]=ans[i]|(1<<b);
                }
            }
            if(!f) 
            {
                System.out.println(-1);
                continue;
            }
            for(int i=0;i<n;i++) 
            {
                if(a[i]!=-1 && ans[i]!=a[i]) 
                {
                    f=false;
                    break;
                }
            }
            if(!f) 
            {
                System.out.println(-1);
                continue;
            }
            for(int i=0;i<n;i++) 
            {
                System.out.print(ans[i]);
                if(i+1<n)
                {
                     System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
