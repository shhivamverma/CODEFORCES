import java.util.*;
public class codeforces90
{
    public static void main(String args[])                // Problem 1845A - Forbidden Integer
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            if(x!=1)
            {
                System.out.println("YES");
                System.out.println(n);
                for(int j=1;j<=n;j++)
                { 
                   System.out.print("1 ");
                }
            }
            else
            {
                if(k==1)
                {
                    System.out.println("NO");
                }
                else if(k==2)
                {
                    if(n%2!=0)
                    {
                        System.out.println("NO");
                    }
                    else
                    {
                        System.out.println("YES");
                        System.out.println(n/2);
                        for(int j=1;j<=n/2;j++)
                        {
                            System.out.println("2 ");
                        }
                    }
                }
                else
                {
                    if(n%2==0)
                    {
                        System.out.println(n/2);
                        for(int j=1;j<=n/2;j++)
                        {
                            System.out.print("2 ");
                        }
                    }
                    else
                    {
                        System.out.println(((n-3)/2)+1);
                        for(int j=1;j<=(((n-3)/2));j++)
                        {
                            System.out.print("2 ");
                        }
                        System.out.print("3");
                    }
                }
            }
        }
    }

}
