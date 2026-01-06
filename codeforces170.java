import java.util.*;
public class codeforces170 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=1;m<=t;m++)
        {
            int n=sc.nextInt();
            int v[]=new int[n];
            boolean has_Non_Zero=false;
            for (int i=0;i<n;i++) 
            {
                v[i] = sc.nextInt();
                if(v[i]!=0)
                {
                    has_Non_Zero=true;
                }
            }
            if (!has_Non_Zero) 
            {
                System.out.println("No");
                continue;
            }
            System.out.println("Yes");
            int pos[]=new int[n]; 
            int neg[]=new int[n]; 
            int p=0;
            int q=0;
            for(int i=0;i<v.length;i++)
            {
                int x=v[i];
                if (x>=0)
                {
                    pos[p++]=x;
                }
                else 
                {
                    neg[q++]=x;
                }
            }
            int ans[]=new int[n];
            long sum=0;
            int i=p-1; 
            int j=q-1; 
            for (int k=0;k<n;k++) 
            {
                if (sum<=0 && i>=0)
                {
                    ans[k]=pos[i--];
                } 
                else 
                {
                    ans[k]=neg[j--];
                }
                sum=sum+ans[k];
            }
            for (int k=0;k<n;k++)
            {
                System.out.println(ans[k]+" ");
            }
        }
    }
}
