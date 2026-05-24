// Once I am done , I will be gone , You won't see me for a while.
import java.util.*;
public class codeforces365
{
    static long mc(long a[],int l,int mid,int r)                                // Problem 1676H2. Maximum Crossings (Hard Version)
    {
        ArrayList<Long> t=new ArrayList<>();
        int i=l;
        int j=mid+1;
        long cnt=0;
        while(i<=mid && j<=r) 
        {
            if(a[i]<a[j]) 
            {
                t.add(a[i]);
                i++;
            }
            else 
            {
                t.add(a[j]);
                cnt += (mid - i + 1);
                j++;
            }
        }
        while(i<=mid) 
        {
            t.add(a[i]);
            i++;
        }
        while(j<=r) 
        {
            t.add(a[j]);
            j++;
        }
        for(int k=l;k<=r;k++) 
        {
            a[k]=t.get(k-l);
        }
        return cnt;
    }
    static long sv(long a[],int l,int r) 
    {
        if(l>=r) 
        {
            return 0;
        }
        int mid=(l+r)/2;
        long cnt=0;
        cnt=cnt+sv(a,l,mid);
        cnt=cnt+sv(a,mid+1,r);
        cnt=cnt+mc(a,l,mid,r);
        return cnt;
    }
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++) 
            {
                a[i]=sc.nextLong();
            }
            System.out.println(sv(a,0,n-1));
        }
    }
}
