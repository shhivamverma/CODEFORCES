import java.util.*;
public class codeforces112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                  // problem - 1676A  Lucky?
        int t = sc.nextInt();  
        for (int k = 0; k < t; k++) {
            String s = sc.next();  
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < 3; i++) {
                sum1 += s.charAt(i);
            }
            for (int i = 3; i < 6; i++) {
                sum2 += s.charAt(i);
            }
            if (sum1 == sum2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

