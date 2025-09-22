import java.util.Scanner;
public class codeforces22 
{
    public static void main(String[] args)                                                      // 1985A - Creating Words
    {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while (t!=0) 
        {
            String a = sc.next();
            String b = sc.next();
            char[] cha=a.toCharArray();
            char[] chb=b.toCharArray();
            char temp = cha[0];
            cha[0]=chb[0];
            chb[0]=temp;
            System.out.println(new String(cha) + " " + new String(chb));
            t--;
        }
        
    }
}
