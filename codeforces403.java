// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codeforces403
{
    public static void main(String args[])                             // Problem 1850C. Word on the Paper
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            char a[][]=new char[8][8];
            for(int i=0;i<8;i++) 
            {
                String s=sc.next();
                for(int j=0;j<8;j++) 
                {
                    a[i][j]=s.charAt(j);
                }
            }
            StringBuilder ans=new StringBuilder();
            for(int i=0;i<8;i++) 
            {
                for(int j=0;j<8;j++) 
                {
                    if(a[i][j]!='.') 
                    {
                        ans.append(a[i][j]);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
