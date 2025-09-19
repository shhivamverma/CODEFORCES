import java.util.*;
class codeforces19
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
            int maxZeros = 0, count = 0;
            for (int m=0;m<n;m++) 
            {
                if (arr[m]==0) 
                {
                     count++;
                     maxZeros=Math.max(maxZeros,count);
                } 
                else 
                {
                     count=0;
                }
            }
            System.out.println(maxZeros);
        }
    }
}