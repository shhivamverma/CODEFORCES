import java.util.*;
public class codeforces47                                   // Problem 705A - Hulk.
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=1;j<=n;j++)
        {
            if(j%2!=0)
            {
                if(j==n)
                {
                    System.out.print("I hate"+" ");
                    break;
                }
                System.out.print("I hate"+" "+"that"+" ");
               
            }
            else
            {
                if(j==n)
                {
                    System.out.print("I love"+" ");
                    break;
                }
            
            
                System.out.print("I love"+" "+"that"+" ");
            
        }
    }
        System.out.print("it");
    }

}
