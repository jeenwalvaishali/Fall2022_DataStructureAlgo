public class UniquePath {

    public int numberOfPossiblePath(int[][] obstacleGrid){

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        dp[0][0] = 1;

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){

                if (obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                    continue;
                }

                if (i>0){
                    dp[i][j] = dp[i][j] + dp[i-1][j];
                }

                if (j>0){
                    dp[i][j] = dp[i][j] + dp[i][j-1];
                }

            }
        }

        return dp[m-1][n-1];

    }
}


/*  Time Complexity:O(m*n)
  Space Complexity:O(mn)*/