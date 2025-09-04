import java.util.*;
public class codeforces3 {
    public static void main(String args[]) {                              //Problem 2133A - Redstone?
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int c = 0;  

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            // Selection sort
            for (int m = 0; m < arr.length - 1; m++) {
                int smallest = m;
                for (int k = m + 1; k < arr.length; k++) {
                    if (arr[smallest] > arr[k]) {
                        smallest = k;
                    }
                }
                int temp = arr[smallest];
                arr[smallest] = arr[m];
                arr[m] = temp;
            }

            for (int q = 1; q < n; q++) {
                if (arr[q] == arr[q - 1]) {
                    c = 1;
                }
            }

            if (c == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

