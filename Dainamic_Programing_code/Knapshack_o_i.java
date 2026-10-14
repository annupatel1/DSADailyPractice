import java.util.Arrays;

public class Knapshack_o_i {

    // 1. Pure Recursion (O(2^N) Time, O(N) Space)
    public static int knapsackRecursive(int w, int[] val, int[] wt, int i) {
        // Base Case: No remaining capacity or no remaining items
        if (w == 0 || i == 0) {
            return 0;
        }

        // If weight of current item <= remaining capacity
        if (wt[i - 1] <= w) {
            int include = val[i - 1] + knapsackRecursive(w - wt[i - 1], val, wt, i - 1);
            int exclude = knapsackRecursive(w, val, wt, i - 1);

            return Math.max(include, exclude);
        } else {
            // Exclude current item if it exceeds capacity
            return knapsackRecursive(w, val, wt, i - 1);
        }
    }

    // 2. Top-Down Dynamic Programming / Memoization (O(N * W) Time & Space)
    public static int knapsackMemoization(int w, int[] val, int[] wt, int i, int[][] dp) {
        // Base Case: No remaining capacity or no remaining items
        if (w == 0 || i == 0) {
            return 0;
        }

        // Return stored result if subproblem is already calculated
        if (dp[i][w] != -1) {
            return dp[i][w];
        }

        if (wt[i - 1] <= w) {
            int include = val[i - 1] + knapsackMemoization(w - wt[i - 1], val, wt, i - 1, dp);
            int exclude = knapsackMemoization(w, val, wt, i - 1, dp);

            // Store in dp array and return
            return dp[i][w] = Math.max(include, exclude);
        } else {
            // Store in dp array and return
            return dp[i][w] = knapsackMemoization(w, val, wt, i - 1, dp);
        }
    }

 public static int tabulation(int n,int w,int[] val, int[] wt , int[][] dp )
 {
    for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<w+1;j++)
            {
                int v=val[i-1];
                int ww=wt[i-1];

                if(ww<=j)
                {
                  int include=v+dp[i-1][j-ww];
                  int exclude=dp[i-1][j];
                  dp[i][j]=Math.max(include,exclude);

                }
                else
                {
                  int exclude=dp[i-1][j];
                      dp[i][j]=exclude;

                }
            }
        }

return dp[n][w];
 }

    

    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int w = 50;
        int n = val.length;

        // 1. Execute Pure Recursion
        System.out.println("Recursion Result: " + knapsackRecursive(w, val, wt, n));

        // 2. Execute Memoization
        // Initialize DP matrix with -1
        int[][] dp = new int[n + 1][w + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println("Memoization Result: " + knapsackMemoization(w, val, wt, n, dp));


        // now we do tabulation 

        int[][] dpTab = new int[n + 1][w + 1];
      
        
System.out.println(
    tabulation(n, w, val, wt, dpTab) + " this result from DP tabulation"
);



    }
}