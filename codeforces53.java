import java.util.*;
public class codeforces53
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int years = 0;
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a<b|| a==b)
        {
            a = a*3;
            b = b*2;
            years++;
            if(a>b)
            {break;}
        }
        System.out.println(years);
    }
}
    
  