import java.util.*;
public class codeforces142 
{
	public static void main(String args[])           // Problem 1855B. Longest Divisors Interval
    {
		long a = 1;
		for (long i = 2; i <= 50; i++) 
        {
			a = lcm(a, i);
		}
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=1;j<=t;j++)
        {
			long n=sc.nextLong();
			int i=1;
			while(n % i == 0) 
            { 
				i++;
			}
			System.out.println(i - 1);
		}
	}
	
	private static long gcd(long a, long b) {
		while (b != 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
    private static long lcm(long a, long b) {
		return a * (b / gcd(a, b));
	}

}
