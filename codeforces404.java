import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                set.add(x);
            }

            if (set.size() == n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}