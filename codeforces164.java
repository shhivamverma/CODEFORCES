import java.util.*;
public class codeforces164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int p = sc.nextInt();
            ans[p] = i;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
