import java.util.*;
public class codeforces145
{
    public static void main(String args[])
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
            int k=Math.abs(arr[0]-1);
            for(int j=1;j<n;j++)
            {
                k=gcd(k,Math.abs(arr[j] - (j + 1)));
            }
            System.out.println(k);
        }
        
    }
        
            private static int gcd(int a,int b)
            {
                if(b==0)
                {
                    return a;
                }
                return gcd(b,a%b);
            }

        }
    
