import java.util.*;
public class codeforces104
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            for(int j=0;j<n;j++)
            {
                b[j]=sc.nextInt();
            }
            int c1=0;
            int c2=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]==1)
                {
                    c1++;
                }
                if(b[j]==1)
                {
                    c2++;
                }
            }
            if(((c1%2!=0) && (c2%2!=0)) || (((c1%2!=0) && (c2%2!=0)) && (c1==c2)))
            {
                System.out.println("Tie");
            }
            else
            {
                int lastIDX=-1;
                for(int j=0;j<n;j++)
                {
                    if(a[j]!=b[j])
                    {
                        lastIDX=j;
                    }
                }
                if(lastIDX % 2 == 0)
                {
                    System.out.println("Ajisai");
                }
                else
                {
                    System.out.println("Mai");
                }
            }
        }
    }
}