import java.util.*;
public class codeforces204
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int ans=Integer.MAX_VALUE;
            long a=sc.nextLong();
            long b=sc.nextLong();
            for(int add=0;add<32;add++)
            {
                int ops=add;
                long newb=b+add;
                if(newb==1)
                {
                    continue;
                }
                long k=a;
                while(k>0)
                {
                    k=k/newb;
                    ops++;
                }
                ans=Math.min(ans,ops);
            }
            System.out.println(ans);
        }
    }

}