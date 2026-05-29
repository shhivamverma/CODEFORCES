// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codeforces373                                                       //  Problem 2181B. Battle of Arrays
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            TreeMap<Integer, Integer> a=new TreeMap<>();
            TreeMap<Integer, Integer> b=new TreeMap<>();
            for(int i=0;i<n;i++) 
            {
                int x=sc.nextInt();
                a.put(x,a.getOrDefault(x, 0)+1);
            }
            for(int i=0;i<m;i++) 
            {
                int x=sc.nextInt();
                b.put(x,b.getOrDefault(x, 0)+1);
            }
            boolean ok=true;
            while(!a.isEmpty()&&!b.isEmpty()) 
            {
                int aa=a.lastKey();
                int bb=b.lastKey();
                if(ok) 
                {
                    removeOne(b,bb);
                    if(aa<bb) 
                    {
                        b.put(bb-aa,b.getOrDefault(bb-aa,0)+1);
                    }
                } 
                else 
                {
                    removeOne(a,aa);
                    if(bb<aa) 
                    {
                        a.put(aa-bb,a.getOrDefault(aa-bb,0)+1);
                    }
                }
                ok=!ok;
            }
            if(b.isEmpty())
            {
                System.out.println("Alice");
            }
            else
            {
                System.out.println("Bob");
            }
        }
    }
    static void removeOne(TreeMap<Integer, Integer> map,int key) 
    {
        int freq=map.get(key);
        if(freq==1) 
        {
            map.remove(key);
        } 
        else 
        {
            map.put(key,freq-1);
        }
    }
}
