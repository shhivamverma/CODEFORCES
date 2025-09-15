import java.util.*;
class codeforces15
{
    long arr[]=new long[1000001];
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long arr[]=new long[1000001];
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
