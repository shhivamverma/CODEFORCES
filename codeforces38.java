import java.util.*;

public class codeforces38{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            long x = sc.nextLong();
            long n = sc.nextLong();
            
            if (n % 2 == 0)
                System.out.println(0);
            else
                System.out.println(x);
        }
        sc.close();
    }
}
