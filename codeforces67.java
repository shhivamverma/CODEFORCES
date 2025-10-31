import java.util.*;
public class codeforces67                           // Problem 1A - Theatre Square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        long a=sc.nextLong();
        long row=(n+a-1)/a;
        long column=(m+a-1)/a;
        System.out.println(row*column);
    }
}

   
