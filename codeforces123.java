import java.util.*;
public class codeforces123
{
    public static void main(String[] args)                // Problem 80A. Panoramix's Prediction
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int next=n+1;
        while(true) 
        {
            boolean prime=true;
            for(int i=2;i*i<=next;i++) 
            {
                if(next % i == 0)
                {
                    prime = false;
                    break;
                }
            }
            if (prime) break;
            next++;
        }
        if (next == m)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

