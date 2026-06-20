// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codeforces407
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextLong();
            }
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    long r=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=r+arr[j];
                }
            }
            System.out.println(arr[n-1]);
        } 
    }
}