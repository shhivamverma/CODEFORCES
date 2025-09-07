import java.util.*;
class codeforces7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int gcd=0;
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            for (int m=0;m<arr.length-1;m++)
            {
                int smallest = m;
                for (int k = m + 1; k < arr.length; k++) {
                    if (arr[smallest] > arr[k]) {
                        smallest = k;
                    }
                }
                int temp = arr[smallest];
                arr[smallest] = arr[m];
                arr[m] = temp;
            }
            gcd=arr[n-1]-arr[0];
            System.out.println(gcd);
        }
    }
}

