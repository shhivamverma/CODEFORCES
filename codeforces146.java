import java.util.*;
public class codeforces146
{
    public  static void main(String args[])                     // Problem 1807D. Odd Queries
    public  static void main(String args[])                     
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int q=sc.nextInt();
            int a[] = new int[n];
                for(int j=0;j<n;j++)
                {                                             
                    a[j]=sc.nextInt();         
                }
                long sum=0;
                for(int j=0;j<n;j++)
                { 
                    sum=sum+a[j];
                }
        
                long pref[] = new long[(int)(n + 1)];
                for (int j = 1; j <= n; j++) 
                {
                    pref[j ] = pref[j-1] + a[j-1];
                }
                while(q-->0)
                {
                    int l=sc.nextInt();
                int r=sc.nextInt();
                int k=sc.nextInt();
                long ans=sum-(pref[(int)r]-pref[(int)(l-1)])+(r-l+1)*k;
                if(ans%2 == 0)
                {
                    System.out.println("NO");
                }
                else
                {
                    System.out.println("YES");
                }
            
        }
    }
}
}



            
