import java.util.*;
public class codeforces121
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next().toLowerCase();
        int freq[]=new int[26];
        for(int i=0;i<n;i++) 
        {
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z') 
            {
                freq[ch-'a']++;
            }
        }
        int count=0;
        for (int i=0;i<26;i++) 
        {
            if(freq[i]>0)
            {
                count++;
            }
        }
        if (count==26)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
