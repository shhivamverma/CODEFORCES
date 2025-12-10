import java.util.*;

public class codeforces124 {
    public static void main(String[] args) {               // Problem codeforces 1915A - Odd One Out
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == b) {
                System.out.println(c);
            } else if (a == c) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        }

    
    }
}

