import java.util.*;
public class codeforces79
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
           int score[][] = 
           {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
            {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
            {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
            {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
            {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
            {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
            {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
            {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
	      };
          for(int i=1;i<=t;i++)
          {
             char arr[][]=new char[10][10];
             for(int j=0;j<10;j++)
             {
                String s=sc.next();
                for(int m=0;m<10;m++)
                {
                    arr[j][m]=s.charAt(m);
                }
             }
             int points=0;
             for(int j=0;j<10;j++)
             {
                for(int m=0;m<10;m++)
                {
                    if(arr[j][m]=='X')
                    {
                        points=points+score[j][m];
                    }
                }
             }
             System.out.println(points);
            }
        }
    }