import java.util.*;
class codeforces12
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
            int p=0;int c=0;
            for(int m=0;m<n-1;m++)
            {
                if(arr[m]+arr[m+1]<1)
                {
                    p=1;
                }
                else
                {
                if(arr[m]==arr[m+1])
                {
                    c++;
                }
                }
            }
            if(p==1 || c==n-1)
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