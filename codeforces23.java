import java.util.*;
public class codeforces23 
{                                                                // Problem 1367B – Even Array
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();         
        while (t!=0) 
        {
            int n=sc.nextInt();
            int evenWrong=0;
            int oddWrong=0;;
            for (int i=0;i<n;i++) 
            {
                int val=sc.nextInt();
                if(i%2==0 && val%2!=0) 
                {
                    evenWrong++;
                }
                if(i%2==1 && val%2!=1) 
                {
                    oddWrong++;
                }
            }
            if(evenWrong==oddWrong)
            {
                System.out.println(evenWrong);
            }
            else
            {
                System.out.println(-1);
            }
            t--;
        }
    }
}
