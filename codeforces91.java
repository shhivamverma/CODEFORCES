import java.util.*;
public class codeforces91 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++) 
        {
            String s = sc.nextLine();
            int n = s.length();
            int firstRightIndex = s.indexOf('>');
            int lastLeftIndex = s.lastIndexOf('<');
            if (firstRightIndex == -1 && lastLeftIndex == -1 ) 
            {
                if(n==1)
                {
                    System.out.println("1");
                }
                else
                {
                    System.out.println("-1");
                }
                continue;
            }
            int maxTimeToLeftShore;
            if (firstRightIndex == -1) 
            {
                maxTimeToLeftShore = n;
            } 
            else 
            {
                maxTimeToLeftShore = firstRightIndex;
            }
            int maxTimeToRightShore;
            if (lastLeftIndex == -1) 
            {
                maxTimeToRightShore = n;
            } 
            else 
            {
                maxTimeToRightShore = n - 1 - lastLeftIndex;
            }
            System.out.println(Math.max(maxTimeToLeftShore, maxTimeToRightShore));
        }
    }
}