import java.util.*;
public class codeforces115
{
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            String s=sc.next();
            int a = 0, b = 0;
            for (int j = 0; j < 5; j++) 
                {
                if (s.charAt(j) == 'A') a++;
                else if (s.charAt(j) == 'B') b++;
            }

            if (a > b) System.out.println("A");
            else System.out.println("B");
        }
    }
}
