// Once I am done , I will be gone , You won't see me for a while.

//  ███████╗ ██╗  ██╗ ██╗ ██╗   ██╗  █████╗  ███╗   ███╗
//  ██╔════╝ ██║  ██║ ██║ ██║   ██║ ██╔══██╗ ████╗ ████║
//  ███████╗ ███████║ ██║ ██║   ██║ ███████║ ██╔████╔██║
//  ╚════██║ ██╔══██║ ██║ ╚██╗ ██╔╝ ██╔══██║ ██║╚██╔╝██║
//  ███████║ ██║  ██║ ██║  ╚████╔╝  ██║  ██║ ██║ ╚═╝ ██║
//  ╚══════╝ ╚═╝  ╚═╝ ╚═╝   ╚═══╝   ╚═╝  ╚═╝ ╚═╝     ╚═╝

import java.util.*;
public class codeforces431
{
    public static void main(String args[])                                     // Problem - 584A. Olesya and Rodion
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        if(t==10) 
        {
            if(n==1) 
            {
                System.out.println(-1);
            } 
            else 
            {
                System.out.print(1);
                for(int i=1;i<n;i++) 
                {
                    System.out.print(0);
                }
            }
        } 
        else 
        {
            for(int i=0;i<n;i++) 
            {
                System.out.print(t);
            }
        }
    }
}
