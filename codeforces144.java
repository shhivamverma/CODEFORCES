import java.util.*;
public class codeforces144
{
    public static void main(String args[])              // Problem 1837B. Comparison String
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int curr=1;
            int large=1;
            for(int j=1;j<n;j++)
            {
                if(s.charAt(j)==s.charAt(j-1))
                {
                    curr++;
                }
                else
                {
                    large=Math.max(large,curr);
                    curr=1;
                }
            }
            large=Math.max(curr,large);
            System.out.println(large+1);
        }
    }

}
