import java.util.*;                                     
class codeforces5                                             // Problem 2117A - False Alarm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
        int n=sc.nextInt();
        int x=sc.nextInt();
        int status[]=new int[n];
        for(int m=0;m<n;m++)
        {
            status[m]=sc.nextInt();
        }
        int first=-1;
        int last=-1;
        for (int j = 0; j < n; j++) 
        {
            if (status[j] == 1)
            {
                if(first==-1)
                {
                    first=j;        
                }
                last=j;
            }
        }
            int range = last-first+1;
            if(x>=range)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}


