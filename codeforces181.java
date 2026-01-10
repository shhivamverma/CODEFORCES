import java.util.*;

public class codeforces181 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            long[] a = new long[n];
            Integer idx[] = new Integer[n];

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                long r = x % k;
                if (r == 0) r = k;
                a[i] = r;
                idx[i] = i;
            }

            Arrays.sort (idx, (i, j) -> {
                if (a[i] != a[j]) 
                {
                  return Long.compare(a[j], a[i]);
                }
              
               return Integer.compare(i, j);
             });


            for (int i = 0; i < n; i++) {
                System.out.print((idx[i] + 1) + " ");
            }
            System.out.println();
        }
    }
}
