import java.util.*;
class codeforces39
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            String str=sc.next();
            if(n>3)
            {
                char ch=str.charAt(0);
                char chh=str.charAt(n-1);
                int count=0;
                if(ch==chh)
                {
                    char c1=str.charAt(1);
                    for(int j=2;j<n-1;j++)
                    {
                        if(str.charAt(j)!=c1)
                        {
                            count++;
                        }
                    }
                }
                else
                {
                    for(int v=1;v<n;v++)
                    {
                        char c2=str.charAt(v);
                        if(str.charAt(v)==c2)
                        {
                            count++;
                        }
                    }
                }
            }
            else
            {
                System.out.println("0");
            }
        }
    }
}