import java.util.*;
public class codeforces89
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
            int c=0;
            for(int j=0;j<n;j++)
            {
                for(int k=j;k<n;k++)
                {
                    if(arr[k]<arr[j])
                    {
                        c=1;
                        break;
                    }
                }
            }
            if(c==1)
            {
                System.out.println("0");
            }
            else
            {
                int diff=arr[1]-arr[0];
                for(int m=1;m<n-1;m++)
                {
                    if(arr[m+1]-arr[m] < diff)
                    {
                        diff=arr[m+1]-arr[m];
                    }
                }
                System.out.println((diff/2)+1);
            }
        }
    }
}