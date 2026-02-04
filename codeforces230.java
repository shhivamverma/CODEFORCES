import java.util.*;
public class codeforces230
{
    public static void main(String args[])                               // Problem 2094F. Trulimero Trulicina
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int c=0;
            for(int i=0;i<n;i++)
            {
                if(m%k==0 && i!=0)
                {
                    c=(c+1)%k;
                }
                for(int j=0;j<m;j++)
                {
                    System.out.print((c+1)+" ");
                    c=(c+1)%k;
                }
                System.out.println();
            }
        }
    }

}
