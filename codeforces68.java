import java.util.*;
public class codeforces68
{
    public static void main(String args[])        // Problem 1890A - Doremy's Paint 3
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            if(n==1 || n==2)
            {
                System.out.println("YES");
            }
            else
            {
                int count=0;
                for(int k=0;k<n;k++)
                {
                    boolean check=true;
                    for(int m=0;m<k;m++)
                    {
                        if(arr[m]==arr[k])
                        {
                            check=false;
                            break;
                        }
                    }
                    if(check)
                    {
                        count++;
                    }  
                }
                if(count>=3)
                {
                    System.out.println("NO");
                } 
                else
                {
                    if(count==1)
                    {
                        System.out.println("YES");
                    }
                    else
                    {
                        int c1=1;
                        int m=arr[0];
                        for(int q=1;q<n;q++)
                        { 
                            if(m==arr[q])
                            {
                                c1++;
                            }
                        }
                        int c2=n-c1;
                        int diff;
                        if(c2>c1)
                        diff=c2-c1;
                        else
                        diff=c1-c2; 
                        if(diff<=1)
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
        }
    }
}
    


                
