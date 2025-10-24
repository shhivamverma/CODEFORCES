import java.util.*;
public class codeforces59
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int r=sc.nextInt();
        for (int i = 1; i <= 15; i++)
        {
            int a = (k * i) % 10;
            if (a == r || a==0)
            {
                 System.out.println(i);
                 break;
            }
        }
    }
}

    
