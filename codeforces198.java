import java.util.*;
public class codeforces198
{
	public static void main(String args[])                  // Problem 1620B. Triangles on a Rectangle
    {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) 
        {
			long w=sc.nextLong(); 
			long h=sc.nextLong();
			long area=Long.MIN_VALUE; 
			for (int i=0;i<4;i++) 
            {
				long k=sc.nextLong(); 
				long first=0;
                long last=0;
				for (int j=0;j<k;j++) 
                { 
					long x=sc.nextLong(); 
					if (j == 0)
                    {
						first = x; 
					}
					if (j == k - 1) 
                    {
						last = x; 
					}
				}
				long base = last - first; 
				long height;
				if (i < 2) 
                {
					height = h; 
				} 
                else 
                {
					height = w;
				}
				area = Math.max(area, base*height); 
			}
			System.out.println(area); 
		}
		
	}
}

