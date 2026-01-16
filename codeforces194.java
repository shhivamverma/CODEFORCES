import java.util.*;
public class codeforces194 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++) 
            {
                a[i] = sc.nextLong();
            }
            long arr[][]=new long[n][2];
            for(int i=0;i<n;i++) 
            {
                arr[i][0]=a[i];   
                arr[i][1]=i+1;
            }
            Arrays.sort(arr, (x, y) -> Long.compare(x[0], y[0]));
            int ans[]=new int[n];
            boolean flag=true;
            int i=0;
            while(i<n) 
            {
                int j=i;
                while (j < n && arr[j][0] == arr[i][0]) 
                {
                    j++;
                }
                if (j - i == 1) 
                {
                    flag = false;
                    break;
                }
                for (int k=i;k<j;k++) 
                {
                    int next=(k + 1 < j) ? k + 1 : i;
                    ans[(int) arr[k][1] - 1]=(int) arr[next][1];
                }
                i = j;
            }
            if (!flag) 
            {
                System.out.println(-1);
            } 
            else 
            {
                for(int x=0;x<ans.length;x++)
                {
                    System.out.print(ans[x]+ " ");
                }
            }
        }
    }
}
