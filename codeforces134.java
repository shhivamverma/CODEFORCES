import java.util.*;
public class codeforces134 
{
    public static void main(String args[])                   // Problem 1955A. Yogurt Sale
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) 
        {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = n / 2;
            if (n % 2 == 0) {
                if (b * x < a * n)
                    System.out.println(b * x);
                else
                    System.out.println(a * n);
            } else {
                if ((b * x + a) < a * n)
                    System.out.println(b * x + a);
                else
                    System.out.println(a * n);
            }
        }
    }
}

