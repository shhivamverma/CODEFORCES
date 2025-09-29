import java.util.*;
class codeforces30
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if(n%2==0)
        {
            sum=n/2;
            System.out.println(sum);
        }
        else
        {
            sum=-(n+1)/2;
            System.out.println(sum);
        }
    }
}