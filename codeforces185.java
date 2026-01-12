import java.util.*;
public class codeforces185
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0)
        {
            int n = sc.nextInt();
            String s = sc.next();
            int[] leftFreq = new int[26];
            int[] rightFreq = new int[26];
            int leftDistinct = 0;
            int rightDistinct = 0;
            for (int i = 0; i < n; i++) 
            {
                int c = s.charAt(i) - 'a';
                if (rightFreq[c] == 0) 
                { 
                    rightDistinct++;
                }
                rightFreq[c]++;
            }
            long ans = 0;
            for (int i = 0; i < n; i++) 
            {
                int c = s.charAt(i) - 'a';
                if (leftFreq[c] == 0)
                {
                    leftDistinct++;
                }
                leftFreq[c]++;
                rightFreq[c]--;
                if (rightFreq[c] == 0)
                {
                    rightDistinct--;
                }
                ans = Math.max(ans, leftDistinct + rightDistinct);
            }
            System.out.println(ans);
        }
    }
}
