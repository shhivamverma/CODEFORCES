import java.util.*;
class codeforces42                                  // Problem 1760A - Medium Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a>b && a>c)
            {
                if(b>c)
                {
                    System.out.println(b);
                }
                else
                {
                    System.out.println(c);
                }
            }
            if(b>a && b>c)
            {
                if(a>c)
                {
                    System.out.println(a);
                }
                else
                {
                    System.out.println(c);
                }
            }
            if(c>a && c>b)
            {
                if(a>b)
                {
                    System.out.println(a);
                }
                else
                {
                    System.out.println(b);
                }
            }
        }
    }

}
