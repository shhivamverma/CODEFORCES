// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codeforces410 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String s=sc.next();
        long ans=1;
        for(int i=1;i<Math.min(n,k);i++) 
        {
            if(s.charAt(i)<s.charAt(i%(int)ans)) 
            {
                ans=i+1;
            } 
            else if(s.charAt(i)>s.charAt(i%(int)ans)) 
            {
                break;
            }
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<k;i++) 
        {
            str.append(s.charAt(i%(int)ans));
        }
        System.out.println(str);
    }
}