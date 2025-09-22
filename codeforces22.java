import java.util.*;
public class codeforces22 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int maxLen = 0;
            int cur = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 0) {
                    cur++;
                    if (cur > maxLen) maxLen = cur;
                } else {
                    cur = 0;
                }
            }
            System.out.println(maxLen);
        }
        sc.close();
    }
}
