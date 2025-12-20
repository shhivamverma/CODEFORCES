import java.util.*;
public class codeforces136
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int freq[]=new int[26];
            for (int j=0;j<n;j++)
            {
               freq[s.charAt(j)-'a']++;
            }
            int odd=0;
            for (int j=0;j<26;j++) 
            {
				odd=odd+freq[j] % 2; 
			}
            if(odd>k+1)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }
    }
}

