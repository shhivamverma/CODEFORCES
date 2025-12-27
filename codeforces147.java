import java.util.*;
public class codeforces147
{
	public static void main(String args[])               // Problem 1794B. Not Dividing
    {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(); 
		 for(int j=1;j<=t;j++)
         {
			int n=sc.nextInt();  
			int arr[]=new int[n];
			for(int i=0;i<n;i++) 
            {
				arr[i]=sc.nextInt(); 
            }
			for(int i = 0; i < n; i++) 
            {
				if(arr[i] == 1) 
                {
					arr[i]++; 
				}
			}
			for (int i=0;i<n-1;i++) 
            {
				if ((arr[i+1] % arr[i]) == 0) 
                {
					arr[i+1]++; 
				}
			}
			for (int i=0;i<n;i++) 
            {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
    }

}
