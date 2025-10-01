import java.util.*;
public class codeforces32 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++) 
        {
            long l=sc.nextLong();
            long r=sc.nextLong();
            int ans=0;
            long val=1;   
            while(val * 2 <= r) 
            {
                val = val * 2;
                ans++;
            }
            System.out.println(ans);
        }
    }
}
