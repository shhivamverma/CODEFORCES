import java.util.*;
public class codeforces162
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            String str=sc.next();
            int ans=0;
            if(str.contains("2026") || !str.contains("2025"))
            {
               ans=0;
            }
            else
            {
                ans=1;
            }
            System.out.println(ans);
        }
    }
}