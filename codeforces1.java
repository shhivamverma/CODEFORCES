import java.util.*;
public class codeforces1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        String s=str.replace("+","");
        int n1=s.length();
        int arr[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            char ch=s.charAt(i);
            int a=ch-'0';
            arr[i]=a;
        }
        for(int j=0;j<arr.length-1;j++)
        {
            int smallest=j;
            for(int m=j+1;m<arr.length;m++)
            {
                if(arr[smallest]>arr[m])
                {
                    smallest=m;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[j];
            arr[j]=temp;
        }
        for(int y=0;y<n1;y++)
        {
            if(y==n1-1)
            {
                System.out.print(arr[y]);
                return;
            }
            System.out.print(arr[y]+"+");
        }
    }
}

        