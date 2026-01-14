import java.util.*;
public class codeforces190
{
    public static void main(String args[])                  // Problem 1744C. Traffic Light
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            char ch=sc.next().charAt(0);
            String str=sc.next();
            str=str+str;
            n=n*2;
            int max=Integer.MIN_VALUE;
            int idx=-1;
            for(int j=n-1;j>=0;j--)
            {
                if(str.charAt(j)=='g')
                {
                    idx=j;
                }
                if(str.charAt(j)==ch)
                {
                    int diff=idx-j;
                    max=Math.max(diff,max);
                }
            }
            System.out.println(max);
        }
    }

}
