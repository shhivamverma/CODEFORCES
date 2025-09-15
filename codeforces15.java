import java.util.*;
class codeforces15
{                                                    
    public static void main(String args[])
    {                                                                       // Problem 1370A - Maximum GCD 
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            if(n%2!=0)
            {
                int max_gc=(n-1)/2;
                System.out.println(max_gc);
            }
            else
            {
                int max_gcd=n/2;
                System.out.println(max_gcd);
            }
        }
    }
}

