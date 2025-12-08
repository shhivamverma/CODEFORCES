import java.util.*;
public class codeforces122
{
    public static void main(String args[])              // Problem 1560A. Dislike of Threes
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();   
        for (int i=0;i<t;i++)
        {
            int k = sc.nextInt();
            int count = 0;
            int num = 1;
            while (true) 
            {
                if (num % 3 != 0 && num % 10 != 3) 
                    {
                    count++;
                    if (count == k) 
                        {
                        System.out.println(num);
                        break;
                    }
                }
                num++;
            }
        }

    }
}

