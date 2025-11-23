import java.util.*;
public class codeforces106
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            int c=0;
            for(int j=0;j<n-1;j++)
            {
                if(a[j]%2 == a[j+1]%2)
                {
                    a[j]=a[j]*a[j+1];
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}

 