import java.util.*;
class codeforces16
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int w=sc.nextInt();
        String str="";
        String str2="";
        String s1="";
        if(y<w && y!=0 && w!=0)
        {
            int max=0;
            for(int i=1;i<=y;i++)
            {
                if(w%i==0 && y%i==0)
                {
                    if(i>max)
                    {
                        max=i;
                    }
                }
            }
            y=y/max;
            w=w/max;
            str=String.valueOf(w);
            str2=String.valueOf(y);
            s1=str2+"/"+str;
        }    
        if(y>w && y!=0 && w!=0)
        {
            int maxx=0;
            for(int j=1;j<=w;j++)
            {
                if(w%j==0 && y%j==0)
                {
                    if(j>maxx)
                    {
                        maxx=j;
                    }
                }
            }
            y=y/maxx;
            w=w/maxx;
            str=String.valueOf(w);
            str2=String.valueOf(y);
            s1=str+"/"+str2;   
        }
        
        
            if((y==w) && y!=0 && w!=0)
            {
            System.out.println("1/1");
            }
            if((y==0)||(w==0))
            {
                System.out.println("0/1");
            }
            System.out.println(s1);
           
        }
    }
