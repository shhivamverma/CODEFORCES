import java.util.*;
public class codeforces117
{
    public static void main(String args[])           //Problem 1729A - Two Elevators
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) 
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int time1=a-1;
            if (time1 < 0) time1 = -time1;

            int t2a = b - c;
            if (t2a < 0) t2a = -t2a;
            int t2b = c - 1;
            if (t2b < 0) t2b = -t2b;
            int time2 = t2a + t2b;

            if (time1 < time2)
               System.out.println("1");
            else if (time2 < time1)
               System.out.println("2");
            else
                System.out.println("3");
        }
    }

}
