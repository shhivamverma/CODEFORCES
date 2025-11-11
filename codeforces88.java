import java.util.*;
public class codeforces88
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            int sum=0;
            int sum2=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]%2!=0)
                {
                    sum=sum+arr[j];
                }
                else
                {
                    sum2=sum2+arr[j];
                }
            }
            if((sum%2==0 && sum2%2==0) || (sum%2!=0 && sum2%2!=0))
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