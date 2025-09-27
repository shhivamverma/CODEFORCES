import java.util.*;
class codeforces27
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=0;
        for(int i=1;i<=m;i++)
        {
            if(m%i==0)
            {
                k++;
            }
        }
        if(k!=2) 
        {
            System.out.println("NO");
            return;
        }
            for(int j=n+1;j<m;j++)
            {
                int c=0;
                for(int l=1;l<=j;l++)
                {
                    if(j%l==0)
                    {
                        c++;
                    }
                }
                if(c==2)
                {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }
    }
