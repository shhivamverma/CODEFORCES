import java.util.*;
class codeforces14
{                                                             // Problem 2126B - No Casino in the Mountains
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int k=sc.nextInt();
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            int good_days=0;
            int count=0;
            for(int m=0;m<n;m++)
            {
                if(a[m]==0)
                {
                    good_days++;
                    if(good_days==k)
                    {
                        count++;
                        good_days=0;
                        m++;
                    }
                }
                else
                {
                    good_days=0;
                }
            }
            System.out.println(count);
        }
    }
}

