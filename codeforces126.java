import java.util.*;
public class codeforces126 
{
    public static void main(String args[])            // Problem 263A - Beautiful Matrix
    {
        Scanner sc=new Scanner(System.in);
        int r=0; 
        int c=0;
        for (int i = 1; i <= 5; i++) 
            {
            for (int j = 1; j <= 5; j++) 
                {
                int x = sc.nextInt();
                if (x == 1) 
                    {
                    r = i;
                    c = j;
                }
            }
        }
        int moves = Math.abs(r - 3) + Math.abs(c - 3);
        System.out.println(moves);
    }
}

