import java.util.*;
public class codeforces21 
{                                                                                         // Task 1 : Sereja and Dima
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int cards[]=new int[n];
        for (int i=0;i<n;i++) 
        {
            cards[i]=sc.nextInt();
        }
        int serejaScore=0;
        int dimaScore=0;
        int left=0;
        int right=n-1;
        boolean serejaTurn=true;
        while(left <= right) 
        {
            if(cards[left] > cards[right]) 
            {
                if(serejaTurn) 
                {
                    serejaScore += cards[left];
                } 
                else 
                {
                    dimaScore += cards[left];
                }
                left++;
            } 
            else 
            {
                if (serejaTurn) 
                {
                    serejaScore += cards[right];
                } 
                else 
                {
                    dimaScore += cards[right];
                }
                right--;
            }
            serejaTurn = !serejaTurn;
        }

        System.out.println(serejaScore + " " + dimaScore);
    }
}

