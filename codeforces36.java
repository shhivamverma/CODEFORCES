import java.util.*;

public class codeforces36 {
    public static void main(String[] args) {               // PROBLEM 2040A - Game of Division
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // If only one element, first player always wins
            if (n == 1) {
                System.out.println("YES");
                System.out.println(1);
                continue;
            }

            int freq[] = new int[k];  // store how many have same remainder mod k
            for (int i = 0; i < n; i++) {
                freq[a[i] % k]++;
            }

            int ans = -1;
            for (int i = 0; i < n; i++) {
                if (freq[a[i] % k] == 1) {  // unique remainder
                    ans = i + 1;  // 1-based index
                    break;
                }
            }

            if (ans == -1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(ans);
            }
        }

        sc.close();
    }

}
