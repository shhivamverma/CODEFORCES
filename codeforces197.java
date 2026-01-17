import java.util.*;
public class codeforces197
{
    public static void main(String args[])               // Problem 1659A. Red Versus Blue
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int r=sc.nextInt();
            int b=sc.nextInt();
            StringBuilder s=new StringBuilder();
            int lr=r/(b+1);
            int exr=r%(b+1);
            int ops=b+1;
            for(int i=1;i<=ops;i++)
            {
                for(int j=0;j<lr;j++)
                {
                   s.append('R');
                }
                if(exr>0)
                {
                    s.append('R');
                    exr--;
                }
                if(i!=ops)
                {
                    s.append('B');
                }
            }
            System.out.println(s.toString());
        }
    }

}
