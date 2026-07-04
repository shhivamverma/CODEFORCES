// Once I am done , I will be gone , You won't see me for a while.

//  ███████╗ ██╗  ██╗ ██╗ ██╗   ██╗  █████╗  ███╗   ███╗
//  ██╔════╝ ██║  ██║ ██║ ██║   ██║ ██╔══██╗ ████╗ ████║
//  ███████╗ ███████║ ██║ ██║   ██║ ███████║ ██╔████╔██║
//  ╚════██║ ██╔══██║ ██║ ╚██╗ ██╔╝ ██╔══██║ ██║╚██╔╝██║
//  ███████║ ██║  ██║ ██║  ╚████╔╝  ██║  ██║ ██║ ╚═╝ ██║
//  ╚══════╝ ╚═╝  ╚═╝ ╚═╝   ╚═══╝   ╚═╝  ╚═╝ ╚═╝     ╚═╝

import java.util.*;
public class codeforces428 
{
	public static void main(String args[])                                 // Problem 1704C. Virus
    {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) 
        {
			int n=sc.nextInt(); 
			int m=sc.nextInt(); 
			int inf[]=new int[m];
			for(int i=0;i<m;i++) 
            {
				inf[i]=sc.nextInt(); 
            }
			Arrays.sort(inf); 
			List<Integer> gaps=new ArrayList<>();
			for(int i=0;i<m-1;i++) 
            {
				gaps.add(inf[i+1]-inf[i]-1); 			
            }
			gaps.add(inf[0]+n-inf[m-1]-1);
			Collections.sort(gaps,Collections.reverseOrder());
			int saved=0;
            int d=0; 
			for(int i=0;i<gaps.size();i++) 
            {
				int gap=gaps.get(i);
				int cgap=gap-d*2; 
				if(cgap>0) 
                {
					saved++; 
					cgap=cgap-2;
					if(cgap>0)
                    {
						saved=saved+cgap;
                    }
					d=d+2;
				}
			}
			System.out.println(n-saved); 
		}
	}
}
