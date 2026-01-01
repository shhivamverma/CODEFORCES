import java.util.*;
public class codeforces163
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int p=a;
            int r=b;
            int k=1;
            int c1=0;
            while(a>=k)
            {
                c1++;
                a=a-k;
                k=k*4;
            }
            int m=2;
            int c2=0;
            while(b>=m)
            {
                c2++;
                b=b-m;
                m=m*4;
            }
            int ans1=0;
            if(c2==c1)
            {
                ans1=c1+c2;
            }
            else if(c2>c1)
            {
                ans1=2*c1;
            }
            else
            {
                ans1=2*c2+1;
            }
            k=1;
            m=2;
            c1=0;
            c2=0;
            while(r>=k)
            {
                c1++;
                r=r-k;
                k=k*4;
            }
            while(p>=m)
            {
                c2++;
                p=p-m;
                m=m*4;
            }
            int ans2=0;
            if(c2==c1)
            {
                ans2=c2+c1;
            }
            else if(c2>c1)
            {
                ans2=2*c1;
            }
            else
            {
                ans2=2*c2+1;
            }
            System.out.println( Math.max (ans1 , ans2) );
        }
    }
}
