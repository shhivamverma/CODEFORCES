import java.util.*;
public class codeforces56
{
    public static void main(String args[])        // Problem 1335A -  Candies and Two Sisters
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        for (long i = 1; i <= n; i++)
        {
          long a=sc.nextLong();
          if (a % 2 != 0)
          {
              System.out.println(a/2);
          }
          else
          {
             System.out.println(a/2 - 1);
          }
        }
    }
}

  
