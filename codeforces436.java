// Once I am done , I will be gone , You won't see me for a while.

//  ███████╗ ██╗  ██╗ ██╗ ██╗   ██╗  █████╗  ███╗   ███╗
//  ██╔════╝ ██║  ██║ ██║ ██║   ██║ ██╔══██╗ ████╗ ████║
//  ███████╗ ███████║ ██║ ██║   ██║ ███████║ ██╔████╔██║
//  ╚════██║ ██╔══██║ ██║ ╚██╗ ██╔╝ ██╔══██║ ██║╚██╔╝██║
//  ███████║ ██║  ██║ ██║  ╚████╔╝  ██║  ██║ ██║ ╚═╝ ██║
//  ╚══════╝ ╚═╝  ╚═╝ ╚═╝   ╚═══╝   ╚═╝  ╚═╝ ╚═╝     ╚═╝

import java.util.*;
public class codeforces436
{
    public static void main(String args[])                  // Problem 1790D. Matryoshkas
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            HashMap<Long,Long> mp=new HashMap<>();
            for (int i=0;i<n;i++) 
            {
                long x=sc.nextLong();
                long freq=mp.getOrDefault(x,0L)+1;
                mp.put(x,freq);
            }
            ArrayList<Long> list=new ArrayList<>(mp.keySet());
            Collections.sort(list);
            long ans=0;
            for(int i=0;i<list.size();i++) 
            {
                long x=list.get(i);
                long cur=mp.get(x);
                long prev=mp.getOrDefault(x-1,0L);
                if(cur>prev) 
                {
                    ans=ans+(cur-prev);
                }
            }
            System.out.println(ans);
        }
    }
}
