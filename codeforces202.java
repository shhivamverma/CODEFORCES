import java.util.*;
public class codeforces202
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String a=sc.next();
            String b=sc.next();
            int n=a.length();
            int m=b.length();
            int ans=0;
            for(int i=1;i<=Math.min(n,m);i++)
            {
                for(int j=0;j+i<=n;j++)
                {
                    for(int k=0;k+i<=m;k++)
                    {
                        String x1=a.substring(j,j+i);
                        String x2=b.substring(k,k+i);
                        if(x1.equals(x2))
                        {
                            ans=Math.max(ans,i);
                        }
                    }
                }
            }
            int ops=n+m-2*ans;
            System.out.println(ops);
        }
    }
}