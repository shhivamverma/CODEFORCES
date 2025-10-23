import java.util.*;
public class codeforces57
{
    public static void main(String args[])                // Problem 200B -  Drinks
    {
        Scanner sc=new Scanner(System.in);
    
    double total = 0;
    int n=sc.nextInt();
    for (int i = 1; i <= n; i++)
    {
        int a=sc.nextInt();
        total += a / 100.0;
    }

    double percent = (total / n) * 100;
    System.out.println(percent);
}

}
