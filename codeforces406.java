// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codeforces406
{
    public static void main(String args[])                                // Problem B. Annoying the Ghost
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            long a[]=new long[n];
            long b[]=new long[n];
            for(int i=0;i<n;i++) 
            {
                a[i]=sc.nextLong();
            }
            for(int i=0;i<n;i++) 
            {
                b[i]=sc.nextLong();
            }
            int used[]=new int[n]; 
            int pos[]=new int[n];  
            boolean possible=true;
            for(int i=0;i<n;i++) 
            {
                boolean found=false;
                for(int j=0;j<n;j++) 
                {
                    if(used[j]==0 && b[j]>=a[i]) 
                    {
                        used[j]=1;
                        pos[i]=j;
                        found=true;
                        break;
                    }
                }
                if(!found) 
                {
                    possible=false;
                    break;
                }
            }
            if(!possible) 
            {
                System.out.println(-1);
                continue;
            }
            long ans=0;
            for(int i=0;i<n;i++) 
            {
                for(int j=i+1;j<n;j++) 
                {
                    if(pos[i]>pos[j]) 
                    {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
