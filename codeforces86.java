import java.util.*;
public class codeforces86
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=1;m<=t;m++)
        {
        int n=sc.nextInt();
        int arr[]=new int[n];
        if(n>1)
        {
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=1;i<n;i++)
        {
            
                if(arr[i]!=arr[0])
                {
                    c=1;
                    break;
                }
            
        }
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int min=arr[0];
        int count=1;
        for(int v=1;v<n;v++)
        {
            if(arr[v]==min)
            {
                count++;
            }
        }
        int arr_c[]=new int[n-count];
        int arr_b[]=new int[count];
        for(int b=0;b<count;b++)
        {
            arr_b[b]=min;
        }
        for(int i=0;i<n-count;i++)
        {
            arr_c[i]=arr[i+count];
        }
        int lc=arr_c.length;
        int lb=arr_b.length;
        if(c==1)
        {
            System.out.println(lb+" "+lc);
            for(int k=0;k<count;k++)
            {
                System.out.print(arr_b[k]+" ");
            }
            for(int k=0;k<arr_c.length;k++)
            {
                System.out.print(arr_c[k]+" ");
            }
        }
        else
        {
            System.out.println("-1");
        }
        }
        else
        {
            System.out.println("-1");
        }
    }
}
}


