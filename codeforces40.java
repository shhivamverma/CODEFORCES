import java.util.*;
public class codeforces40
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(minOps(a, b));
        }
    }
    static int minOps(long a, long b) {
        if (a == b) {
            return 0;
        }
        if (a % b == 0 || b % a == 0) {
            return 1;
        }
        return 2;
    }
}
