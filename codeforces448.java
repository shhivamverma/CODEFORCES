// Once I am done , I will be gone , You won't see me for a while.

//  ███████╗ ██╗  ██╗ ██╗ ██╗   ██╗  █████╗  ███╗   ███╗
//  ██╔════╝ ██║  ██║ ██║ ██║   ██║ ██╔══██╗ ████╗ ████║
//  ███████╗ ███████║ ██║ ██║   ██║ ███████║ ██╔████╔██║
//  ╚════██║ ██╔══██║ ██║ ╚██╗ ██╔╝ ██╔══██║ ██║╚██╔╝██║
//  ███████║ ██║  ██║ ██║  ╚████╔╝  ██║  ██║ ██║ ╚═╝ ██║
//  ╚══════╝ ╚═╝  ╚═╝ ╚═╝   ╚═══╝   ╚═╝  ╚═╝ ╚═╝     ╚═╝

import java.util.*;
public class codeforces448
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String str=sc.next();
            String mex="";
            for(char ch='a';ch<='z';ch++)
            {
                if(mex.isEmpty()&&str.indexOf(ch)==-1)
                {
                    mex=String.valueOf(ch);
                    break;
                }
            }
            for(char chh='a';chh<='z';chh++)
            {
                for(char chhh='a';chhh<='z';chhh++)
                {
                    String s=""+chh+chhh;
                    if(mex.isEmpty()&&str.indexOf(s)==-1)
                    {
                        mex=s;
                        break;
                    }
                }
            }
            for(char chh='a';chh<='z';chh++)
            {
                for(char chhh='a';chhh<='z';chhh++)
                {
                    for(char chhhh='a';chhhh<='z';chhhh++)
                    {
                        String s=""+chh+chhh+chhhh;
                        if(mex.isEmpty()&&str.indexOf(s)==-1)
                        {
                            mex=s;
                            break;
                        }
                    }
                }
            }
            System.out.println(mex);
        }
    }
}