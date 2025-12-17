import java.util.*;
public class codeforces133
{
    public static void main(String args[])                 // Problem 1977A. Little Nikita
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) 
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n >= m) 
            {
                if ((n - m) % 2 == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } 
            else 
            {
                System.out.println("NO");
            }
        }
    }
}
