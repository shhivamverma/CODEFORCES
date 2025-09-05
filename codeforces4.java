import java.util.*;
class codeforces4                                                         // Problem 2070A - FizzBuzz Remixed
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c=0;
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            if((n%15)+1<3)
            {
                c=(n/15)*3+((n%15)+1);
            }
            else
            {
                c=(n/15)*3+3;
            }
            System.out.println(c);
        }
    }

}
