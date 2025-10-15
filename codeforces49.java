import java.util.*;
class codeforces49
{
    public static void main(String args[])         // Problem 1896A - Jagged Swaps
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
            int min=arr[0];
            int r=arr[0];    
            for(int j=1;j<n;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                }
            }
            if(min==r)
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

