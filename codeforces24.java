import java.util.*;
public class codeforces24 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   
        while (t != 0) 
        {
            int n = sc.nextInt();  
            int ans = (n + 1) / 2; 
            System.out.println(ans);
            t--;
        }
    }
}

