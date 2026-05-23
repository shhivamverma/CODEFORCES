// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codeforces364
{
    public static void main(String args[]) 
    {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) 
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int mini = Math.min(x, y);
            int maxi = Math.max(x, y);
            System.out.println(mini + " " + maxi);
        }
    }
}