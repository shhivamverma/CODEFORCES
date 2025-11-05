import java.util.*;
public class codeforces72
{
	public static void main(String[] args)               // Problem 1877A - Goals of Victory
    {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(); 
		for(int i=1;i<=t;i++) 
        { 
			int n = sc.nextInt(); 
			int arr[]=new int[n-1];
			for (int j=0;j<n-1;j++)
            { 
				arr[j] = sc.nextInt(); 
			}
            int sum=0;
			for (int m=0;m<n-1;m++) 
            {
				sum=sum+arr[m]; 
			}
			System.out.println(sum*-1); 
		}
    }

}
