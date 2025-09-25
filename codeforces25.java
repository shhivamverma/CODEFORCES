import java.util.*;
public class codeforces25
{
    public static void main(String args[])                                    // Problem 1987 - Upload More RAM
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();         
        while (t!=0) 
        {
            long n = sc.nextLong();  
            long k = sc.nextLong();  
            long ans = 1+(n-1)*k; 
            System.out.println(ans);
            t--;
        }
    }
}

