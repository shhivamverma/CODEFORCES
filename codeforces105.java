import java.util.*;
public class codeforces105
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
            Arrays.sort(arr);
            int max=arr[n-1];
            int min=arr[0];
            if(min==max)
            {
                System.out.println("No");
            }
            else
            {
                System.out.println("Yes");
                System.out.println(arr[n-1]);
                for(int j=0;j<n-1;j++)
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}

