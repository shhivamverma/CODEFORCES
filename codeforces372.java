import java.util.*;
public class codeforces372
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(sum<s)
            {
                count++;
            }
        }
        System.out.println(count+1);
    }
}