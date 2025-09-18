import java.util.*;
class codeforces18
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int l=n;
            int c=0;
            while(n!=0)
            {
                int k=n%10;
                c++;
                n=n/10;
            }
            int r=0;
            int count=0;                                
            int temp = l;
            while(temp!=0)
            {
                int k = temp % 10;
                if(k!=0) count++;                         
                temp=temp/10;
            }
            System.out.println(count);                   
            while(l!=0)
            {
                int k=l%10;
                if(k!=0)
                {                                   
                    System.out.println(k*(int)Math.pow(10, r) + " ");
                }
                r++;
                l=l/10;
            }                  
        }
    }
}
