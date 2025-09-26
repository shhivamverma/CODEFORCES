import java.util.*;
public class codeforces26 
{                                                                           // Problem - 1303 Erasing Zeroes
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();        
        while (t!=0) 
        {
            String s = sc.next();    
            int first = s.indexOf('1');
            int last = s.lastIndexOf('1');

            if (first == -1 || first == last) 
            {
                System.out.println(0);
            } 
            else 
            {
                int count = 0;
                for (int i = first; i <= last; i++) 
                {
                    if (s.charAt(i) == '0') 
                    {
                        count++;
                    }
                }
                System.out.println(count);
            }
            t--;
        }
    }
}
