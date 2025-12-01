import java.util.*;
public class codeforces114
{
    public static void main(String args[])            // Problem - 1850  To My Critics
  {
        Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++) 
    {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a + b >= 10 || b + c >= 10 || c + a >= 10)
            System.out.println("YES");
        else
           System.out.println("NO");
    }
}
}
