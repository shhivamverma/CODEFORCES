import java.util.*;

public class codeforces188
{
    public static void main(String[] args) {             // Problem 2184C. Huge Pile
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            boolean found = false;

            for (int i = 0; i < 32; i++) {
                long p = (long) Math.pow(2, i);
                long q = n / p;
                long r = n % p;

                if (k == q + 1 && r > 0) {
                    System.out.println(i);
                    found = true;
                    break;
                }

                if (k == q && p > r) {
                    System.out.println(i);
                    found = true;
                    break;
                }

                if (q + 1 < k) break;
            }

            if (!found) {
                System.out.println(-1);
            }
        }

    }
}

