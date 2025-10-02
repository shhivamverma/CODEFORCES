import java.util.*;
class codeforces33                                       // Problem 2029A - A. Set
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();   
            int ans=((r/k)-l+1);
            if(ans<0)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println(ans);
            }
        }
    }

}
