import java.util.*;
class codeforces48
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        int count=0;
        for(int j=0;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                if(arr[j].equals(arr[k]))
                {
                    count++;
                    break;
                }
            }
        }
        System.out.println(n-count);
    }
}