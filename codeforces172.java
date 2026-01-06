import java.util.*;
public class codeforces172
{
    public static void main(String args[])               // Problem 1380A. Three Indices
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
            int k=0;
            for(int j=1;j<n-1;j++)
            {
                if(arr[j-1]<arr[j] && arr[j]>arr[j+1])
                {
                    System.out.println("YES");
                    System.out.println(j+" "+(j+1)+" "+(j+2));
                    k=1;
                    break;
                }
            }
            if(k==0)
            {
                System.out.println("NO");
            }
        }
    }

}
