import java.util.*;
class codeforces17
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            if(n%3!=0)
            {
                System.out.println("First");
            }
            else
            {
                System.out.println("Second");
            }
        }
    }
}