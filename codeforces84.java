import java.util.*;
public class codeforces84
{
    public static void main(String args[])          // Problem 1030A - In Search of an Easy Problem
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            int a=sc.nextInt();
            if(a==1)
            {
                count++;
            }
        }
        if(count>=1)
        System.out.println("HARD");
        else
        System.out.println("EASY");
    }

}
