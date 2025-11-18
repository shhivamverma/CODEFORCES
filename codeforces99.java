import java.util.*;
public class codeforces99
{
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=1;j<=t;j++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int count=0;
            int count1=0;
            int k=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]%2==0)
                {
                   count++;
                }
            }
            if(count==0)
            {
                System.out.println(1/n);
            }
            else if(count%2!=0)
            {
                System.out.println(-1/n);
            }
            else
            {
                for(int i=0;i<n;i++)
                {
                    if(arr[i]%2==0)
                    {
                        count1++;
                    
                        if(count1==count/2)
                        {
                           k=i+1;
                        }
                    }
                }
                System.out.println(k);
            }
              
        }
    }
}
    