import java.util.*;
public class codeforces161 
{
	public static void main(String args[])             //  Problem 1559A. Mocha and Math
    {
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong(); 
		for(int j=1;j<=t;j++)
        {
			long n=sc.nextLong(); 
			long a[]=new long[(int) n];
			for (int i=0;i<n;i++) 
            { 
				a[i]=sc.nextLong();
			}
			long totalAnd=a[0]; 
			for (int i=1;i<n;i++) 
            { 
				totalAnd = totalAnd & a[i];
			}
			System.out.println(totalAnd); 
		}
	}
}

