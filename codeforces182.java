import java.util.*;
public class codeforces182
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long l=sc.nextLong();
            long r=sc.nextLong();
            String s1=Long.toString(l);
            String s2=Long.toString(r);
            int c=0;
            int k=0;
            while(k<s1.length())
            {
                if(s1.charAt(k)==s2.charAt(k))
                {
                    c=c+2;
                }
                else
                {
                    break;
                }
                k++;
            }
            int count=0;
            boolean check=true;
            while(k<s1.length())
            {
                if(s1.charAt(k)==s2.charAt(k)-1 && count<1)
                {
                    if(check)
                    {
                        c++;
                        
                        count++;
                        k++;
                    }
                    else 
                    {
                        break;
                    }
                }
                else if(s1.charAt(k)=='9' && s2.charAt(k)=='0' && count<=1 && check)
                {
                    while(k<s1.length() && s1.charAt(k)=='9' && s2.charAt(k)=='0')
	                {
	                    c++;
                        check=false;
	                    k++;
                    }
	            }
                else
                {
                    break;
                }
            }
            System.out.println(c);
        }
    }
}


             