import java.util.*;
class codeforces11
{
    public static void main(String args[])                             // Problem 2072A – New World, New Me, New Array
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int p=sc.nextInt();
            int max=n*p;
            int min=-max;
            if(k<min || k>max)
            {
                System.out.println("-1");
            }
            else
            {
                int mod=Math.abs(k);
                int operations=(mod+p-1)/p;
                System.out.println(operations);
            }
        }
    }

}
