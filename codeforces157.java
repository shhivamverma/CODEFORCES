import java.util.*;
public class codeforces157
{
    public static void main(String args[])                  // Problem 1607B. Odd Grasshopper
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            long x=sc.nextLong();
            long n=sc.nextLong();
            long pos=0;
            if(n%4 == 1)
            {
                pos=-n;
            }
            else if(n%4 == 2)
            {
                pos=1;
            }
            else if(n%4 == 3)
            {
                pos=n+1;
            }
            else
            {
                pos=0;
            }
            if(x%2 == 0)
            {
                pos=x+pos;
            }
            else
            {
                pos=x-pos;
            }
            System.out.println(pos);
        }
    }
}

  
