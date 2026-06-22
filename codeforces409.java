// Once I am done , I will be gone , You won't see mr for a while.

import java.util.*;
public class codeforces409
{
    public static void main(String args[])                               // Problem 2044B. Normal Problem
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            int n=s.length();
            String str="";
            for(int i=n-1;i>=0;i--)
            {
                if(s.charAt(i)=='q')
                str=str+'p';
                else if(s.charAt(i)=='p')
                str=str+'q';
                else
                str=str+'w';    
            }
            System.out.println(str);
        }
    }
}
