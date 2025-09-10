import java.util.*;
class codeforces10
{
    public static void main(String args[])                                     // Problem 2131A – Lever
    {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();   
        for(int i=1;i<=t;i++)
        {
            int n = sc.nextInt();   
            int[] a = new int[n];
            int[] b = new int[n];
            for (int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            for (int m=0;m<n;m++) 
            {
                b[m]=sc.nextInt();
            }
            int ans=0;
            for(int k=0;k<n;k++)
            {
                if(a[k]>b[k])
                {
                    ans=ans+(a[k]-b[k]);
                }
            }
            ans++;
            System.out.println(ans);
        }
    }

}
