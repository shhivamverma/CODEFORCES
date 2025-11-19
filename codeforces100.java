import java.util.*;
public class codeforces100
{
    public static void main(String args[])           // Problem 1788 -  A One and Two
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            int total=0;
            int curr=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]==2)
                {
                    total++;
                }
            }
            int idx=-1;
            for(int j=0;j<n;j++)
            {
                if(arr[j]==2)
                {
                    curr++;
                }
                if(curr==(total-curr))
                {
                    idx=j+1;
                    break;
                }
            }
            System.out.println(idx);
        }
    }

}

