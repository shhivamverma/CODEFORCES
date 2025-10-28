import java.util.*;
public class codeforces64
{
    public static void main(String args[])                    // Problem Your Name -  2167B 
    {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 1; i <= q; i++) 
        {
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();
            boolean possible = true;
            for (char ch = 'a'; ch <= 'z'; ch++) 
            {
                int count1 = 0;
                int count2 = 0;
                for (int j = 0; j < n; j++) 
                {
                    if (s.charAt(j) == ch)
                    {
                        count1++;
                    }
                }
                for (int j = 0; j < n; j++) 
                {
                    if (t.charAt(j) == ch)
                    {
                        count2++;
                    }
                }
                if (count1 != count2) 
                {
                    possible = false;
                    break;
                }
            }

            if (possible)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        
    }
}

