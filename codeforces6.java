import java.util.*;
class codeforces6                                                       // Problem 344A - Magnets
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.next();
        }
        int grp=1;
        for(int i=1;i<n;i++)
        {
            if (!arr[i].equals(arr[i - 1]))
            {
                grp++;    
            }
        }
        System.out.println(grp);
    }

}
