import java.util.*;
public class codeforces200
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) 
        {
            int n=sc.nextInt();
            long a[]=new long[n];
            for (int i=0;i<n;i++) 
            {
                a[i]=sc.nextLong();
            }
            long pair[][]=new long[n][2];
            for (int i=0;i<n;i++) 
            {
                pair[i][0]=a[i];
                pair[i][1]=i;
            }
            Arrays.sort(pair, (x, y) -> Long.compare(y[0], x[0]));
            long ans[]=new long[n + 1];
            ans[0]=0;
            long minutes=0;
            long pos=1;
            for (int i=0;i<n;i++) 
            {
                int idx=(int)pair[i][1];
                long visits=pair[i][0];
                ans[idx+1]=pos;
                minutes=minutes+(2*(Math.abs(pos)*visits));
                if(pos>0) 
                {
                    pos=-1*pos;
                } 
                else 
                {
                    pos=-1*pos+1;
                }
            }
            System.out.println(minutes);
            for (int j=0;j<=n;j++) 
            {
                System.out.print(ans[(int)j] + " ");
            }
            System.out.println();
        }
    }
}