import java.util.*;
public class codeforces173
{
    public static void main(String args[])          // Problem 1373B. 01 Game
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            String str=sc.next();
            int c1=0;
            int c2=0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j)=='0')
                {
                    c1++;
                }
                else
                {
                    c2++;
                }
            }
            int ops=(int)Math.min(c1,c2);
            if(ops%2 != 0)
            {
                System.out.println("DA");
            }
            else
            {
                System.out.println("NET");
            }
        }
    }

}
