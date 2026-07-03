import java.util.*;
public class codeforces426
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int fa[]=new int[n+1];
        boolean a[]=new boolean[n+1];
        while (m-->0) 
        {
            char type=sc.next().charAt(0);
            int x=sc.nextInt();
            if(type=='+' && a[x]) 
            {
                System.out.println("Already on");
                continue;
            }
            if(type=='-' && !a[x]) 
            {
                System.out.println("Already off");
                continue;
            }
            ArrayList<Integer> fc=new ArrayList<>();
            int tmp=x;
            for(int i=2;i*i<=tmp;i++) 
            {
                if(tmp%i == 0) 
                {
                    fc.add(i);
                    while(tmp%i == 0) 
                    {
                        tmp=tmp/i;
                    }
                }
            }
            if(tmp>1)
            {
                fc.add(tmp);
            }
            if(type == '+') 
            {
                int conflict=0;
                for(int i=0;i<fc.size();i++) 
                {
                    int p=fc.get(i);
                    if(fa[p] != 0) 
                    {
                        conflict=fa[p];
                        break;
                    }
                }
                if(conflict!=0) 
                {
                    System.out.println("Conflict with " + conflict);
                } 
                else 
                {
                    a[x]=true;
                    for(int i=0;i<fc.size();i++) 
                    {
                        int p=fc.get(i);
                        fa[p]=x;
                    }
                    System.out.println("Success");
                }
            } 
            else 
            {
                a[x]=false;
                for(int i=0;i<fc.size();i++) 
                {
                    int p=fc.get(i);
                    fa[p]=0;
                }
                System.out.println("Success");
            }
        }
    }
}