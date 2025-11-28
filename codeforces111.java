import java.util.*;
public class codeforces111
{
    public static void main(String args[])          // Problem 1829A - Love Story!
    {
        Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            String s="codeforces";
            for(int i=0;i<t;i++)
            {
                int count=0;
                String str=sc.next(); 
                int len = str.length();
                for(int j=0;j<len;j++)
                    {
                    if(s.charAt(j)!=str.charAt(j))
                        {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }


        
