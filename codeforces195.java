import java.util.*;
public class codeforces195
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][3];
        for (int i=0;i<n;i++) 
        {
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
            a[i][2]=i+1;
        }
        Arrays.sort(a, new Comparator<int[]>() {
            public int compare(int[] x, int[] y) {
                if (x[0] == y[0])
                    return y[1] - x[1];
                return x[0] - y[0];
            }
        });
        int maxRight = a[0][1];
        int maxIndex = a[0][2];
        for (int i=1;i<n;i++)
        {
            if(a[i][1] <= maxRight)
            {
                System.out.println(a[i][2] + " " + maxIndex);
                return;
            }
            if (a[i][1] > maxRight)
            {
                maxRight = a[i][1];
                maxIndex = a[i][2];
            }
        }
        System.out.println("-1 -1");
    }
}
