import java.util.*;
public class codeforces16
{
    public static void main(String args[])                                       // - Problem 9A – Die Roll
    {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int w=sc.nextInt();
        int max=Math.max(y,w);
        int poss_outcomes=6-max+1;
        int total_outcomes=6;
        int maxx=0;
        for(int i=1;i<=poss_outcomes;i++)
        {
            if(poss_outcomes%i==0 && total_outcomes%i==0)
            {
                if(i>maxx)
                {
                    maxx=i;
                }
            }
        }
        poss_outcomes=poss_outcomes/maxx;
        total_outcomes=total_outcomes/maxx;
        String s1=String.valueOf(poss_outcomes);
        String s2=String.valueOf(total_outcomes);
        String ans=s1+"/"+s2;
        System.out.println(ans);
    }
}




