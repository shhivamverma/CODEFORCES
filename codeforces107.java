import java.util.*;
public class codeforces107
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int ans=0;
            if(n<10) 
            {
                ans=n;
            }
            else if(n<100)
            {
                ans=9+n/10;
            }
            else if(n<1000)
            { 
                ans=18+n/100;
            }
            else if(n<10000)
            {
                ans=27+n/1000;
            }
            else if(n<100000) 
            {
                ans=36+n/10000;
            }
            else 
            {
                ans=45+n/100000;
            }
            System.out.println(ans);
        }
    }
}
           