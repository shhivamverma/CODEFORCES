import java.util.*;
public class codeforces177
{
	public static void main(String args[])                 // Problem 1883C. Raspberries
    {
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong(); 
		for(int j=1;j<=t;j++)
        {
			long n=sc.nextLong(); 
			long k=sc.nextLong(); 
			long a[]=new long[(int) n];
			for (int i=0;i<n;i++) 
            {
				a[i]=sc.nextLong();
			}
			long ans=Integer.MAX_VALUE; 
			long ec=0; 
			for (int i=0;i<n;i++) 
            {
				if (a[i]%2==0)
                {
					ec++; 
				}
				if (a[i]%k==0) 
                {
					ans = 0; 
				}
                else
                {  
				    ans = Math.min(ans, (k-a[i]%k));
                }
			}
			if (k==4) 
            {
                int m;
				if (ec>=2) 
                {
					m=0; 
				} 
                else if (ec==1)
                {
					m=1; 
				} 
                else
                {
					m=2; 
             	}
                ans=(Math.min(ans,(long)m)); 
			}
			System.out.println(ans); 
		}
	}
}

