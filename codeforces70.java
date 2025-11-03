import java.util.*;
public class codeforces70
{
            public static boolean is_substring(String s,String x)           // Problem 1881 A. Don't Try to Count
            {
                for(int i=0;i<=x.length()-s.length();i++)
                {
                    if(x.length()<s.length())
                    {
                        return false;
                    }
                    if(x.substring(i,i+s.length()).equals(s))
                    {
                        return true;
                    }
                }
                return false;
            }
            public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                for(int i=1;i<=t;i++)
                {
                    int n=sc.nextInt();
                    int m=sc.nextInt();
                    String x=sc.next();
                    String s=sc.next();
                    String x0=x;
                    String x1=x0+x0;
                    String x2=x1+x1;
                    String x3=x2+x2;
                    String x4=x3+x3;
                    String x5=x4+x4;
                    int ans=0;
                    if(is_substring(s,x0))
                    {
                        ans=0;
                    }
                    else if(is_substring(s,x1))
                    {
                        ans=1;
                    }
                    else if(is_substring(s,x2))
                    {
                        ans=2;
                    }
                    else if(is_substring(s,x3))
                    {
                        ans=3;
                    }
                    else if(is_substring(s,x4))
                    {
                        ans=4;
                    }
                    else if(is_substring(s,x5))
                    {
                        ans=5;
                    }
                    else
                    {
                        ans=-1;
                    }
                    System.out.println(ans);
                }
            }

        }            
