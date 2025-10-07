
import java.util.*;
public class codeforces39                             // Problem 1054A - Be Positive
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            
            if (!sc.hasNextInt()) break;
            int n = sc.nextInt();
            
            long zeroCount = 0;
            long negOneCount = 0;
            
            for (int j = 0; j < n; j++) {
                if (!sc.hasNextInt()) break;
                int element = sc.nextInt();

                if (element == 0) {
                    zeroCount++;
                } else if (element == -1) {
                    negOneCount++;
                }
            }
            
            long totalOps = zeroCount;
            
            if (negOneCount % 2 != 0) {
                totalOps += 2;
            }

            System.out.println(totalOps);
        }
        
        
    }
}
          
