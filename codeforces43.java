import java.util.*;
class codeforces43
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int points[]=new int[n+2];  // starting , n-fuelstation, return point(x)
            points[0]=0;
            for(int j=1;j<=n;j++)
            {
                points[j]=sc.nextInt();
            }
            points[n+1]=x;
            int max_distance=0;
            for(int k=1;k<=n+1;k++)
            {
                int distance=points[k]-points[k-1];
                if(k==n+1);
                {
                    distance=distance*2;
                }
                if(distance>max_distance)
                {
                    max_distance=distance;
                }
            }
            System.out.println(max_distance);
        }
    }
}