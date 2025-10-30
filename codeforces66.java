import java.util.*;
public class codeforces66
{
    public static void main(String args[])          // Problem 703A - Mishka and Game
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int count1=0;
        int count2=0;
        for(int i=1;i<=n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b)
            {
               count1++;
            }
            if(b>a)
            {
               count2++;
            }
        }
        if(count1>count2)
        {
            System.out.println("Mishka");
        }
        else if(count2>count1)
        {
            System.out.println("Chris");
        }
        else
        {
            System.out.println("Friendship is magic!^^");
        }
    }

}
