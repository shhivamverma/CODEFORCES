import java.util.*;
public class codeforces176
{
    public static void main(String args[])                   // Problem 1913B. Swap and Delete
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            String str=sc.next();
            int n=str.length();
            int c0=0;
            int c1=0;
            for(int j=0;j<n;j++) 
            {
				if(str.charAt(j)=='0')
                {
					c0++;
				} 
                else 
                {
					c1++;
				}
			}
            int lt=0;
            for(int j=0;j<n;j++)
            {
                if(str.charAt(j)=='0' && c1>0)
                {
                    c1--;
                    lt++;
                }
                else if(str.charAt(j)=='1' && c0>0)
                {
                    c0--;
                    lt++;
                }
                else 
                {
                    break;
                }
            }
            System.out.println(n-lt);
        }
    }

}
