import java.util.*;
public class codeforces128
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 1;
        for (int i = 1; i < s.length(); i++) 
            {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                if (count == 7) {
                    System.out.println("YES");
                    return;
                }
            } else {
                count = 1;
            }
        }
        System.out.println("NO");
    }
}
