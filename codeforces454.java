// Once I am done , I will be gone , You won't see me for a while.

//  ███████╗ ██╗  ██╗ ██╗ ██╗   ██╗  █████╗  ███╗   ███╗
//  ██╔════╝ ██║  ██║ ██║ ██║   ██║ ██╔══██╗ ████╗ ████║
//  ███████╗ ███████║ ██║ ██║   ██║ ███████║ ██╔████╔██║
//  ╚════██║ ██╔══██║ ██║ ╚██╗ ██╔╝ ██╔══██║ ██║╚██╔╝██║
//  ███████║ ██║  ██║ ██║  ╚████╔╝  ██║  ██║ ██║ ╚═╝ ██║
//  ╚══════╝ ╚═╝  ╚═╝ ╚═╝   ╚═══╝   ╚═╝  ╚═╝ ╚═╝     ╚═╝

import java.util.*;
public class codeforces454
{
    public static void main(String args[])                             // Problem 1832C. Contrast Value
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            ArrayList<Long> a=new ArrayList<>();
            long x;
            int curr=0;
            for(int i=0;i<n;i++)
            {
                x=sc.nextLong();
                a.add(x);
            }      
            if(n==1)
            {
                System.out.println(1);
                continue;
            }
            int count=0;
            for(int i=1;i<n;i++)
            {
                if(a.get(i-1)>a.get(i) && curr!=1)
                {
                    count++;
                    curr=1;
                }
                else if(a.get(i-1)<a.get(i) && curr!=-1)
                {
                    count++;
                    curr=-1;
                }
            }
            System.out.println(count+1);
        }
    }
}
