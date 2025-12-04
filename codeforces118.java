import java.util.*;
public class codeforces118
{
    public static void main(String args[])             // Problem 1619A - Square String?
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0) 
        {
            String s=sc.next();
            int n =s.length();
            if (n % 2 != 0) {
                System.out.println("NO");
                continue;
            }
            int square = 1; 
            for (int i = 0; i < n/2; i++) {
                if (s.charAt(i) != s.charAt(i + n/2)) {
                    square = 0;
                    break;
                }
            }
            if (square==1)
                System.out.println("YES");
            else
               System.out.println("NO");
        }
    }

}
