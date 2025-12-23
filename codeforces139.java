import java.util.*;
public class codeforces139
{
    public static void main(String args[])                                  // Problem 1869A. Make It Zero
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            long n=sc.nextLong();
            long arr[]=new long[(int)n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextLong();
            }
            if(n%2 == 0)
            {
                System.out.println("2");
                System.out.println(1+" "+n);
                System.out.println(1+" "+n);
            }
            else
            {
                System.out.println("4");
                System.out.println(1+" "+(n-1));
                System.out.println(1+" "+(n-1));
                System.out.println((n-1)+" "+n);
                System.out.println((n-1)+" "+n);
            }
        }
    }

}
