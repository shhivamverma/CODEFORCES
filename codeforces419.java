// Once I am done , I will be gone , You won't see me for a while.

//  ███████╗ ██╗  ██╗ ██╗ ██╗   ██╗  █████╗  ███╗   ███╗
//  ██╔════╝ ██║  ██║ ██║ ██║   ██║ ██╔══██╗ ████╗ ████║
//  ███████╗ ███████║ ██║ ██║   ██║ ███████║ ██╔████╔██║
//  ╚════██║ ██╔══██║ ██║ ╚██╗ ██╔╝ ██╔══██║ ██║╚██╔╝██║
//  ███████║ ██║  ██║ ██║  ╚████╔╝  ██║  ██║ ██║ ╚═╝ ██║
//  ╚══════╝ ╚═╝  ╚═╝ ╚═╝   ╚═══╝   ╚═╝  ╚═╝ ╚═╝     ╚═╝

import java.util.*;
public class codeforces419                                                         // Problem 1914D. Three Activities
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            int c[]=new int[n];
            for(int i=0;i<n;i++)
            { 
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            { 
                b[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            { 
                c[i]=sc.nextInt();
            }
            Integer A[]=new Integer[n];
            Integer B[]=new Integer[n];
            Integer C[]=new Integer[n];
            for(int i=0;i<n;i++) 
            {
                A[i] = i;
                B[i] = i;
                C[i] = i;
            }
            Arrays.sort(A,(i,j)->a[j]-a[i]);
            Arrays.sort(B,(i,j)->b[j]-b[i]);
            Arrays.sort(C,(i,j)->c[j]-c[i]);
            int ans=0;
            for(int i=0;i<3;i++) 
            {
                for(int j=0;j<3;j++) 
                {
                    for(int k=0;k<3;k++) 
                    {
                        int x=A[i];
                        int y=B[j];
                        int z=C[k];
                        if(x==y || y==z || x==z)
                        {
                            continue;
                        }
                        ans=Math.max(ans,a[x]+b[y]+c[z]);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
