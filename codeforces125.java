import java.util.*;
public class codeforces125
{
    public static void main(String[] args) {           // Problem 577A.Multiplication Table
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long x = sc.nextLong();

        long count = 0;

        for (long i = 1; i <= n; i++) {
            if (x % i == 0) {
                long j = x / i;
                if (j <= n) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}

