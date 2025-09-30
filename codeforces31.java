import java.util.*;
class codeforces31
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=t;i++)
        {
            int a=sc.nextInt();
            sc.nextLine();
            String s1=sc.nextLine();
            int b=sc.nextInt();
            sc.nextLine();
            String s2=sc.nextLine();
            String s3=sc.nextLine();
            String result=s1;
            for(int j=0;j<b;j++)
            {
                char ch=s3.charAt(j);
                if(ch=='D')
                {
                    result=result+s2.charAt(j);
                }
                else
                {
                    result=s2.charAt(j)+result;
                }
            }
            System.out.println(result);
        }
    }
}