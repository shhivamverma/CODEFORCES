import java.util.*;
public class codeforces138 
{
	public static void main(String args[]) 
    {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(); 
		for(int i=1;i<=t;i++)
        {
			long a = sc.nextLong(); 
			long b = sc.nextLong(); 
			int n = sc.nextInt(); 
			long x[]=new long[n];
			for (int j=0;j<n;j++) 
            {
				x[j]=sc.nextLong();
			}
			long maxTime = b;
			for (int j=0;j<n;j++) 
            {
				maxTime=maxTime+Math.min(x[j],a-1);
			}
			System.out.println(maxTime);
		}
	}
}
