import java.util.*;
public class codeforces131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long k = a + b + c;

            if (k % 3 == 0) {
                if (k / 3 >= b && k / 3 > a)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else {
                System.out.println("NO");
            }
        }

    
    }
}
