import java.util.*;
public class codeforces156
{
	public static void main(String args[])                    // Problem 1624B. Make AP
    {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(); 
		for(int i=1;i<=t;i++) 
        {
			long a = sc.nextLong(); 
			long b = sc.nextLong(); 
			long c = sc.nextLong(); 
			int k=0;
			long aa = (2 * b) - c; 
			if (aa / a > 0 && aa % a == 0)
            {
                k=1;
			}
			long bb = (a + c) / 2; 
			if (bb / b > 0 && bb % b == 0 && (c - a) % 2 == 0) 
            { 
				k=1;
			}
			long cc = 2 * b - a;
			if (cc / c > 0 && cc % c == 0) 
            { 
                k=1;
            }
			if(k==1) 
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


