import java.util.Scanner;

public class Main {
    public static void main(String[] args) {                 // Problem 1760A - A. Medium Number
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a, b, c;

        for(int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if(a > b && a > c) {
                if(b > c)
                    System.out.println(b);
                else
                    System.out.println(c);
            }
            else if(b > c) {
                if(c > a)
                    System.out.println(c);
                else
                    System.out.println(a);
            }
            else {
                if(a > b)
                    System.out.println(a);
                else
                    System.out.println(b);
            }
        }

        sc.close();
    }
}

