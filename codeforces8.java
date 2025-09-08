import java.util.*;
class codeforces8
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
            for (int m=0;m<arr.length-1;m++)
            {
                int smallest=m;
                for (int k=m+1;k<arr.length;k++) 
                {
                    if (arr[smallest]>arr[k])
                     {
                        smallest=k;
                    }
                }
                int temp=arr[smallest];
                arr[smallest]=arr[m];
                arr[m]=temp;
            }
            int startEven=-1;
            int endEven=-1;
            int startOdd=-1;
            int endOdd=-1;
            for(int k=0;k<n;k++)
            {
                if(arr[k]%2==0)
                {
                    if(startEven==-1)
                    {
                        startEven=k;
                    }
                    endEven=k;
                }
                else
                {
                       if(startOdd==-1)
                       {
                           startOdd=k;
                       }
                       endOdd=k;
                    }
                }
                int x=0;
            if(startEven!=-1)
            {
                int evenLength=endEven-startEven+1;
                if(evenLength>x)
                {
                    x=evenLength;
                }
            }
            if(startOdd!=-1)
            {
                int oddLength=endOdd-startOdd+1;
                if(oddLength>x)
                {
                    x=oddLength;
                }
            }
            int answer=n-x;
            System.out.println(answer);
        }
    }
}