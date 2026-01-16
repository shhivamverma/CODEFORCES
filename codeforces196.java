import java.util.*;
public class codeforces196
{
	public static void main(String args[]) 
    {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(); 
		while (t-- > 0) 
        {
			long n = sc.nextLong(); 
			long k = sc.nextLong(); 
			String s = sc.next(); 
			long prefix[]=new long[(int) n + 1];
			for (int i = 0; i < n; i++) 
            {
				if(s.charAt(i) == 'W')
                {
                    prefix[i + 1] = prefix[i] + 1;
                }
                else
                {
                    prefix[i + 1] = prefix[i] + 0;
                }
			}
			long min = Long.MAX_VALUE; 
			for (int i = 0; i <= n - k; i++) 
            {
				long diff = prefix[i + (int) k] - prefix[i];
				min = Math.min(min , diff);
			}
			System.out.println(min);
		}
    }
}
