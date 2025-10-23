import java.util.*;
public class codeforces58
{
    public static void main(String args[])               // Problem 705A - Vasya the Hipster
    {
        Scanner sc=new Scanner(System.in); 
        int a=sc.nextInt();
        int b=sc.nextInt();
        int rem=0, days=0;
        if (a >= b)
        {
           days = b;
           rem = a - days;
        }
        else
        {
           days = a;
           rem = b - days;
        }
        System.out.println(days);
        System.out.println(rem/2);
    }

}
