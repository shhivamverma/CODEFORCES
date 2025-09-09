import java.util.*;
class codeforces9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            String str=sc.next();
            int n=Integer.parseInt(str);
            int sq=(int)Math.sqrt(n);
            if(sq*sq==n)
            {
                System.out.println(0+" "+sq);
            }
            else
            {
                System.out.println("-1");
            }
        }
    }
}