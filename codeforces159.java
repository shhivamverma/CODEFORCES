import java.util.*;
public class codeforces159 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            String s=sc.next();
            int n=s.length();
            int ans=100; 
            {
                int cntRight = 0;
                int cntLeft = 0;
                int j;
                for (j=n-1;j>=0;j--)
                {
                    if(s.charAt(j)!='0')
                    {
                        cntRight++;
                    } 
                    else 
                    {
                        break;
                    }
                }

                if (j >= 0) 
                {
                    for (int k = j - 1; k >= 0; k--) 
                    {
                        if (s.charAt(k) != '0' && s.charAt(k) != '5') 
                        {
                            cntLeft++;
                        } 
                        else
                       {
                            ans = Math.min(ans, cntRight + cntLeft);
                            break;
                        }
                    }
                }
            }

            {
                int cntRight = 0;
                int cntLeft = 0;
                int j;
                for (j = n - 1; j >= 0; j--)
                {
                    if (s.charAt(j) != '5') 
                    {
                        cntRight++;
                    } 
                    else
                   {
                        break;
                    }
                }
                if (j >= 0) 
                {
                    for (int k = j - 1; k >= 0; k--)
                    {
                        if (s.charAt(k) != '2' && s.charAt(k) != '7')
                        {
                            cntLeft++;
                        } 
                        else 
                        {
                            ans = Math.min(ans, cntRight + cntLeft);
                            break;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
