import java.util.*;
public class codeforces187
{
    public static void main(String args[])                   // Problem 279B. Books
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int a[]=new int[n];
        for(int j=0;j<n;j++)
        {
            a[j]=sc.nextInt();
        }
        int sum=0;
        int count=0;
        int k=0;
        for(int j=0;j<n;j++)
        {
            sum=sum+a[j];
            if(sum<=t)
            {
                count++;
            }
            else
            {
                sum=sum-a[k];
                k++;
            }
        }
        System.out.println(count);
    }
}

