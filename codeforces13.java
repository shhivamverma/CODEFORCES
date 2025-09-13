import java.util.*;
class codeforces13
{                                                              // Problem 1806 A. Walking Master
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            int diff_x=x2-x1;
            int diff_y=y2-y1;
            if(diff_y<0 || diff_y-diff_x<0)
            {
                System.out.println("-1");
            }
            else
            {
                int totalmoves=2*diff_y-diff_x;
                System.out.println(totalmoves);
            }
        }
    }

}
