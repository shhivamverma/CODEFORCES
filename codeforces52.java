import java.util.*;
public class codeforces52                         // Problem 1950A - Stair, Peak, or Neither?
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for (int i = 0; i < n; i++)
       {
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
          if (a < b && b < c)
          {
              System.out.println("STAIR");
          }
          else if (a < b && b > c)
         {
             System.out.println("PEAK");
         }
         else
         {
             System.out.println("NONE");
         }
       }
    }

}
