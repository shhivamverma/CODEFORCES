import java.util.*;
public class codeforces372
{
    public static void main(String args[])                    // Problem 105231C. Liar
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int sum=0;
        
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        if(sum==s)
        System.out.println(n);
        else
        System.out.println(n-1);
    }
}
