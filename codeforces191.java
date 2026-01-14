import java.util.*;
public class codeforces191
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        
            long n=sc.nextLong();
            long d=sc.nextLong();
            long a[]=new long[(int)n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
            }
            Arrays.sort(a);
            long l=-1;
            long r=n-1;
            long size=1;
            long teams=0;
            while(l<r)
            {
                if(a[(int)r]*size<=d)
                {
                    l++;
                    size++;
                }
                else
                {
                    teams++;
                    r--;
                    size=1;
                }
            }
            System.out.println(teams);
        }
    
}