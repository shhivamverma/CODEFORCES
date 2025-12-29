import  java.util.*;
public class codeforces155
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
            Arrays.sort(a);
            
            int maxCount=1;
            int currCount=1;
            for(int j=1;j<n;j++)
            {
                if(a[j-1] == a[j])
                {
                    currCount++;
                }
                else
                {
                    currCount=1;
                }
                if(currCount > maxCount)
                {
                    maxCount=currCount;
                    
                }
            }
            int ops=0;
            while(maxCount < n)
            {
                ops++;
                if(maxCount*2 <= n)
                {
                    ops=ops+maxCount;
                    maxCount=maxCount*2;
                }
                else
                {
                    ops=ops+n-maxCount;
                    maxCount=n;
                }
            }
            System.out.println(ops);
        }
    }
}
