import java.util.*;
public class codeforces54
{
    public static void main(String args[])              // Problem 2044A - Easy Problem 
    {
        Scanner sc=new Scanner(System.in);
   
    int n=sc.nextInt();
    for (int i = 0; i < n; i++)
    {
        int count = 0;
        int k=sc.nextInt();
        for (int a = 0; a < k; a++)
        {
            for (int b = 0; b < k; b++)
            {
                if (a + b == k)
                {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}

}
