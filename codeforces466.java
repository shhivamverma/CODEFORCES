// Once I am done , I will be gone , You won't see me for a while.

//  ███████╗ ██╗  ██╗ ██╗ ██╗   ██╗  █████╗  ███╗   ███╗
//  ██╔════╝ ██║  ██║ ██║ ██║   ██║ ██╔══██╗ ████╗ ████║
//  ███████╗ ███████║ ██║ ██║   ██║ ███████║ ██╔████╔██║
//  ╚════██║ ██╔══██║ ██║ ╚██╗ ██╔╝ ██╔══██║ ██║╚██╔╝██║
//  ███████║ ██║  ██║ ██║  ╚████╔╝  ██║  ██║ ██║ ╚═╝ ██║
//  ╚══════╝ ╚═╝  ╚═╝ ╚═╝   ╚═══╝   ╚═╝  ╚═╝ ╚═╝     ╚═╝

// LinkedIn - https://www.linkedin.com/in/shivamverma-dev
// GitHub - https://github.com/shhivamverma
// Portfolio - https://my-next-portfolio-hlye.vercel.app/

import java.util.*;
public class codeforces466
{
	public static void main(String args[])                                   // Problem 1857D. Strong Vertices (1300) 
    {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(); 
		while(t-->0) 
        {
			int n=sc.nextInt(); 
			int a[]=new int[n];
			int b[]=new int[n];
			int diff[]=new int[n]; 
			int max=Integer.MIN_VALUE; 
			for(int i=0;i<n;i++) 
            {
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) 
            {
				b[i]=sc.nextInt();
				diff[i]=a[i]-b[i]; 
				max=Math.max(max,diff[i]); 
			}
			List<Integer> ans=new ArrayList<>();
			for(int i=0;i<n;i++) 
            {
				if (diff[i]==max) 
                {
					ans.add(i+1); 
				}
			}
			System.out.println(ans.size());
			for(int j=0;j<ans.size();j++)
            {
				System.out.print(ans.get(j)+" "); 
			}
			System.out.println();
		}
	}
}
