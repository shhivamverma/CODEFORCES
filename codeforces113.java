import java.util.*;
public class codeforces113
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) 
            {
            int n=sc.nextInt(); 
            int x=sc.nextInt();  
            if (n <= 2)
            {
                System.out.println(1);
            }
              
            else 
                {
                int floor = ((n - 2) + x - 1) / x + 1;
                System.out.println(floor);
            }
        }
    }
}