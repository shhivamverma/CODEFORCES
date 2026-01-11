import java.util.*;
public class codeforces183 
{
	public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong(); 
		while(t-- > 0)
        {			
            long n=sc.nextLong(); 
			long k=sc.nextLong(); 
			long q=sc.nextLong(); 
			long a[]=new long[(int) n];
			for(int i=0;i<n;i++) 
            {
				a[i]=sc.nextLong(); 
				if(a[i] > q) 
                {
                    a[i]=0;
                }
                else
                {
                    a[i]=1;
                } 
			}
			long c1=0;
			long count=0;
			for(int i=0;i<n;i++) 
            {
				if(a[i] == 1) 
                {
					c1++; 
				} 
                else 
                {
					if(c1 >= k) 
                    {
						long diff = c1 - k + 1;
						count = count + (diff * (diff + 1)) / 2; 
					}
					c1= 0; 
				}
			}
			if (c1 >= k) 
            {
				long diff = c1 - k + 1;
				count = count + (diff * (diff + 1)) / 2;
			}

			System.out.println(count); 
		}
	}
}
