import java.util.*;
public class codeforces201
{
    public static void main(String args[])            // Problem 1567B MEX or Mixup 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();   
        while (t-->0) 
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long n=a-1;
            long xor=0;
            long rem=n%4;
            if(rem==0) 
            {
                xor=n;
            } 
            else if(rem==1) 
            {
                xor=1;
            } 
            else if(rem==2) 
            {
                xor=n+1;
            } 
            else 
            {
                xor=0;
            }
            if(xor==b) 
            {
                System.out.println(a);
            } 
            else if ((xor^b)!=a) 
            {
                System.out.println(a+1);
            } 
            else 
            {
                System.out.println(a+2);
            }
        }
    }
}
