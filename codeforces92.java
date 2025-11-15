import java.util.*;
public class codeforces92
{
    public static void main(String args[])            // Problem 2169A - Alice and Bob
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int a=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            int cnt1=0;
            int cnt2=0;
            int b=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]<a)
                {
                    cnt1++;
                }
                else if(arr[j]>a)
                {
                    cnt2++;
                }
                else
                {
                    b=b+1;
                }
            }
            if(cnt1>cnt2)
            {
                b=a-1;
            }
            else 
            {
                b=a+1;
            }
            System.out.println(b);
        }
    }
}


       
