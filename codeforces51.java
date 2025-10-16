import java.util.*;
public class codeforces51
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int pay=0;
        for(int i=1;i<=w;i++)
        {
            pay += k*i;
        }
        if(pay <=n )
        {
            System.out.println("0");
        }
        else
        {
            System.out.println(pay-n);
        }
    }
}
    

  