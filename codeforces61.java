import java.util.*;
public class codeforces61
{
    public static void main(String args[])                // Problem 271A - Beautiful Year
    {
        Scanner sc=new Scanner(System.in);
        int year1=sc.nextInt();    
        int year=year1+1;
        int n=year1;
        int n1=year1;
        for(int i=0;i<=1000;i++)
        {
            year=i+year1+1;
            int a=year%10;
            year=year/10;
            int b=year%10;
            year=year/10;
            int c=year%10;
            year=year/10;
            int d=year;
            year=i+n1;
            if(a==b || a==c ||a==d||b==c||b==d||c==d)
            {
                n=n+1;
            }
            else
            {
                break;
            }
        }
    System.out.println(year+1);
    }
}
