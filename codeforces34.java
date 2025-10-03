import java.util.*;
class codeforces34
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
            int pos=0;
            int neg=0;
            for(int m=0;m<n;m++)
            {
                if(a[m]==1)
                {
                    pos++;
                }
                else
                {
                    neg++;
                }
            }
            int ans=0;
            if(pos>=neg)
            {
                ans=(neg % 2 == 0) ? 0 : 1;
                System.out.println(ans);
            }
            else
            {
                int diff=neg-pos;
                int k=(diff+1)/2;                     //int sum=(pos+k)-(neg-k);
                if ((neg - k) % 2 != 0)
                { 
                    k++;                     //sum>=0
                              //k>=(neg-pos)/2  // +1 so as to avoid confusion when diff<0
                }   
                ans=k;
            }
            System.out.println(ans);
        }
    }
}