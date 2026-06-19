// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codeforces405
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int sum=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n-1;i++)
            {
                if(arr[i+1] > arr[i])
                {
                    arr[i+1]=arr[i];
                }
            }
            for(int i=0;i<n;i++)
            {
                sum=sum+arr[i];
            }
            System.out.println(sum);
        }
    }
}