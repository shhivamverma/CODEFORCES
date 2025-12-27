import java.util.*;
public class codeforces149 
{
	public static void main(String args[])                 // Problem 1696B. NIT Destroys the Universe
    {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(); 
		for(int j=1;j<=t;j++)
        {
			long n=sc.nextLong(); 
			long[] a=new long[(int) n];
			for(int i=0;i<n;i++) 
            { 
				a[i]=sc.nextLong();
			}
			int count=0; 
			for(int i=0;i<n;i++) 
            {
				if(a[i]==0) 
                {
					count++;
				}
			}
			boolean found=false;   
			int left=0;
			int right=(int)n-1;
			while(left<n&&a[left]==0) 
            {
				left++;
			}
			while(right>=0&&a[right]==0) 
            {
				right--;
			}
			for(int i=left;i<=right;i++) 
            {
				if(a[i]==0) 
                {
					found=true;
					break;
				}
			}
			if(count==n) 
            { 
				System.out.println("0");
			} 
            else if(!found) 
            { 
				System.out.println("1");
			} 
            else 
            { 
				System.out.println("2");
			}
		}
		
	}

}
