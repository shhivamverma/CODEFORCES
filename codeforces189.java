import java.util.*;
public class codeforces189
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int s=sc.nextInt();
        if((s == 0 && m > 1) || s > (9 * m)) 
        {
            System.out.println("-1 -1");
            return;
        }
        if (s == 0 && m == 1)
        {
            System.out.println("0 0");
            return;
        }
        int sum=s;
        String mx="";
        for (int i=0;i<m;i++)
        {
            int d=Math.min(9, sum);
            mx=mx+d;
            sum=sum-d;
        }
        sum=s;
        int digits[]=new int[m];
        for (int i = m - 1; i >= 0; i--) 
        {
            int d = Math.min(9, sum);
            digits[i] = d;
            sum = sum - d;
        }
        if (digits[0]==0)
        {
            for(int i = 1; i < m; i++)
            {
                if(digits[i] > 0)
                {
                    digits[i]--;
                    digits[0] = 1;
                    break;
                }
            }
        }
        String mn = "";
        for (int i = 0; i < m; i++) 
        {
            mn = mn + digits[i];
        }
        System.out.println(mn + " " + mx);
    }
}
