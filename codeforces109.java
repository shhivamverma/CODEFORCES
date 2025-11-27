import java.util.*;

public class codeforces109 
{
    public static void main(String args[]) 
    {
        
        Scanner sc=new Scanner(System.in);
        
       
        int t=sc.nextInt();
        
        for(int k=1;k<=t;k++)
        {
            
            long a = sc.nextLong();
            long b = sc.nextLong();
            long xk = sc.nextLong();
            long yk = sc.nextLong();
            long xq = sc.nextLong();
            long yq = sc.nextLong();
            
            
            long[][] king={
                {xk + a, yk + b},
                {xk + a, yk - b},
                {xk - a, yk + b},
                {xk - a, yk - b},
                {xk + b, yk + a},
                {xk + b, yk - a},
                {xk - b, yk + a},
                {xk - b, yk - a}
            };
            
            
            long[][] queen={
                {xq + a, yq + b},
                {xq + a, yq - b},
                {xq - a, yq + b},
                {xq - a, yq - b},
                {xq + b, yq + a},
                {xq + b, yq - a},
                {xq - b, yq + a},
                {xq - b, yq - a}
            };
            
            
            long[][] Common = new long[8][2];
            int count = 0; 
            
            for (int i = 0; i < 8; i++) 
            {
                
                for(int j = 0; j < 8; j++) 
                {
                   
                    if(king[i][0] == queen[j][0] && king[i][1] == queen[j][1]) 
                    {
                        boolean Counted = false;
                        for (int c = 0; c < count; c++) 
                        {
                            
                            if (king[i][0] == Common[c][0] && king[i][1] == Common[c][1]) 
                                {
                                Counted = true;
                                break;
                               }
                        }
                        
                        if (!Counted) 
                            {
                            Common[count][0] = king[i][0];
                            Common[count][1] = king[i][1]; 
                            count++;
                        }
                        
                        
                        break; 
                    }
                }
            }
            
            System.out.println(count);
        }
        
    }
}