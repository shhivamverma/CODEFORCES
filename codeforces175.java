import java.util.*;
public class codeforces175
{
    public static void main(String args[])              // Problem 1374B. Multiply by 2, divide by 6
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            long n=sc.nextLong();
            long c1=0;
            long c2=0;
            long j=n;
            for(;j%3==0;j/=3)
            {
                
                    c1++;
                
            }
            for(;j%2==0;j/=2)
            {
                
                    c2++;
                
            }
            if(c2>c1 || j!=1)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println(c1-c2+c1);
            }
        }
    }

}
