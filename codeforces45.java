import java.util.*;
public class codeforces45                          // Problem 467A - George and Accomodation 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            int p=sc.nextInt();
            int q=sc.nextInt();
            {
                if((q-p)>=2)
                {
                   c++;
                }
            }
        }
        System.out.println(c);
    }
}
