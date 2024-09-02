//Function to return the minimum cost to react at bottom
	//right cell from top left cell.
    public int minimumCostPath(int[][] grid)
    {
        int minCost[]=new int[]{Integer.MAX_VALUE};
        helper(grid,0,0,minCost,0);
        return minCost[0];
    }
    private void helper(int[][] grid,int i,int j,int[] minCost,int cost){
        if(i>=grid.length || j>=grid[0].length){
            return;
        }
        cost+=grid[i][j];
        // If we have reached the bottom-right cell, update minCost
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            minCost[0] = Math.min(minCost[0], cost);
            return;
        }
        // Move down
        helper(grid, i + 1, j, minCost, cost);

        // Move right
        helper(grid, i, j + 1, minCost, cost);
    }

// EXAMPLE
Input: grid = {{9,4,9,9},{6,7,6,4},{8,3,3,7},{7,4,9,10}}
Output: 43
Explanation: The grid is-
9 4 9 9
6 7 6 4
8 3 3 7
7 4 9 10
The minimum cost is-
9 + 4 + 7 + 3 + 3 + 7 + 10 = 43.

// optimal(Dynamic Programming)
public int minimumCostPath(int[][] grid)
    {
        int rows = grid.length;
        int cols = grid[0].length;
        
        // Create a DP table
        int[][] dp = new int[rows][cols];
        
        // Initialize the top-left corner
        dp[0][0] = grid[0][0];
        
        // Fill the first row (only can come from the left)
        for (int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        
        // Fill the first column (only can come from above)
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        
        // Fill the rest of the DP table
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        
        // The answer is in the bottom-right corner
        return dp[rows - 1][cols - 1];
    }
