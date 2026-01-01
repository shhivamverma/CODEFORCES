import java.util.*;
public class codeforces165 
{
	public static void main(String args[])                   // Problem 1543A. Exciting Bets
    {
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong(); 
		for(int i=1;i<=t;i++)
        {
			long a=sc.nextLong(); 
			long b=sc.nextLong(); 
			if(b>a) 
            {
				long temp=a;
				a=b;
				b =temp;
			}
			if(a==b) 
            {
				System.out.println("0 0");
			}
            else 
            {
				long gcd=a-b;
				long moves=Math.min((b % gcd),(gcd - b % gcd));
				System.out.println(gcd +" "+ moves);
			}
		}
	}
}

