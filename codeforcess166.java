public import java.util.*;

public class codeforcess166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean hard = falcoddese;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 1) {
                hard = true;
            }
        }

        if (hard) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
    }
}
