import java.util.*;
public class codeforces65
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        for (int i = 1; i <= n; i++)
        {
            long t=0;
           long a=sc.nextLong();
           long b=sc.nextLong();
           if (a == b)
           {
               t = 0;
           }
            else if (a < b)
            {
                t = b - a;
            }
        else
        {
            t = a - b;
        }
        
        long c = t / 10;
        if (t % 10 == 0)
           System.out.println(c);
        else
           System.out.println(c+1);
    }
}
}