import java.util.*;
public class codeforces41
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            if(n%3==0)
            {
                System.out.println("0");
            }
            else
            {
                int x=(3-n%3)%3;
                System.out.println(x);
            }
        }
    }
}