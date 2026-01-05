import java.util.*;
public class codeforces169
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            long n=sc.nextLong(); 
			long x=sc.nextLong();
            long arr[]=new long[(int) n];
            long sum=0;
            long max=0;
            for(int j=0;j<n;j++) 
            {
				arr[j]=sc.nextLong(); 
			}
            for(int j=0;j<n;j++) 
            {
                sum=sum+arr[j];
            }
            for(int j=0;j<n;j++) 
            {
                max=max+(long)Math.ceil(arr[j]*1.0/x);
            }
            sum=(long)Math.ceil(sum*1.0/x);
            System.out.println(sum+" "+max);
        }
    }
}



   