import java.util.*;
public class codeforces178
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        for(int m=1;m<=t;m++)
        {
            int n = sc.nextInt();
            long[] v = new long[n];
            long[] w = new long[n];
            for(int i = 0; i < n; i++)
            {
                 v[i] = sc.nextLong();
            }
            for(int i = 0; i < n; i++)
            {
                 w[i] = sc.nextLong();
            }
            int maxOps=n*n + n;
            long[] type = new long[maxOps];
            long[] pos = new long[maxOps];
            int cnt = 0;
            for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < n - 1 - i; j++) 
                {
                    if (v[j] > v[j + 1]) 
                    {
                        long temp = v[j];
                        v[j] = v[j + 1];
                        v[j + 1] = temp;
                        type[cnt] = 1;
                        pos[cnt] = j + 1;
                        cnt++;
                    }
                }
            }
            for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < n - 1 - i; j++) 
                {
                    if (w[j] > w[j + 1]) 
                    {
                        long temp = w[j];
                        w[j] = w[j + 1];
                        w[j + 1] = temp;
                        type[cnt] = 2;
                        pos[cnt] = j + 1;
                        cnt++;
                    }
                }
            }
            for (int i = 0; i < n; i++) 
            {
                if (v[i] > w[i]) 
                {
                    type[cnt] = 3;
                    pos[cnt] = i + 1;
                    cnt++;
                }
            }

            System.out.println(cnt);
            for (int i = 0; i < cnt; i++) 
            {
                System.out.println(type[i] + " " + pos[i]);
            }
        }
    }
}
