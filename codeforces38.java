import java.util.*;
public class codeforces38
{
    public static void main(String[] args)           // Problem 2148A - Sublime Sequence
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        while (t-- > 0) 
        {
            long x = sc.nextLong();
            long n = sc.nextLong();
            
            if (n % 2 == 0)
                System.out.println(0);
            else
                System.out.println(x);
        }
    
    }
}

