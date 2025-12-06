import java.util.*;
public class codeforces120 
{
    public static void main(String args[])                         // Problem 59A - Word
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();  
        int upper=0;
        int lower=0;
        for (int i=0;i<s.length();i++) 
        {
            char c=s.charAt(i);
            if(c >= 'A' && c <= 'Z')
            {
                upper++;
            }
            else
            {
                lower++;
            }
        }
        String result = "";
        for (int i=0;i<s.length();i++) 
        {
            char c=s.charAt(i);
            if (upper > lower && c >= 'a' && c <= 'z') 
            {
                result+=(char)(c-32);  
            }
            else if (upper <= lower && c >= 'A' && c <= 'Z') 
            {
                result+=(char)(c+32);  
            }
            else 
            {
                result+=c;
            }
        }
        System.out.println(result);
    }
}

