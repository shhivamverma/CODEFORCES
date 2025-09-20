import java.util.*;
public class codeforces20 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt(); 
        while (t!=0) 
        {
            int n=sc.nextInt();
            String s=sc.next();            
            int l=0; 
            int r=n-1;
            while(l<r && s.charAt(l) != s.charAt(r)) 
            {
                l++;
                r--;
            }
            int remaining=r-l+1;
            System.out.println(remaining);
        }
    }
      
}
