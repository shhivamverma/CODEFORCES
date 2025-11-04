import java.util.*;
public class codeforces71
{
    public static void main(String args[])                 // Problem 1878A - How Much Does Daytona Cost?
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int m=0;m<n;m++)
            {
                arr[m]=sc.nextInt();
            }
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]==k)
                {
                    c=1;
                }
            }
            if(c==1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }

}
