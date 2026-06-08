// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codeforces382
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int k=0;
            for(int i=0;i<3;i++) 
            {
                boolean stop=false;
                for(int j=0;j<n;j++) 
                {
                    int v=sc.nextInt();
                    if(!stop) 
                    {
                        if((v|x)!=x) 
                        {
                            stop = true;
                        }
                        else
                        {
                            k=k|v;
                        }
                    }
                }
            }
            if(k==x)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}