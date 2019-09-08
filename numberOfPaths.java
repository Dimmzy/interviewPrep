public class numberOfPaths {
    // Naive Solution
    static int numPaths(int m, int n) {
        // returns 1 if the row is the first one or the column is the first one
        if (m == 1 || n == 1) {
            return 1;
        }
        // If we can move diagnoally, add + numPaths(m-1,n-1).
        return numPaths(m - 1, n) + numPaths(m, n-1);

    }

    // Dynamic Programming Solution
    static int numPathsB(int m, int n) {
        int count[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            count[i][0] = 1;
        }

        for (int j = 0; j < n; j++) {
            count[0][j] = 1;
        }

        //
        for (int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                count[i][j] = count[i - 1][j] + count[i][j - 1];
            }
        }

        return count[m - 1][n - 1];
    }
}
