class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        // Memoization table
        Boolean[][] dp = new Boolean[m + 1][n + 1];
        return isMatchHelper(s, p, 0, 0, dp);
    }

    private boolean isMatchHelper(String s, String p, int i, int j, Boolean[][] dp) {
        // Base case: if both strings are exhausted
        if (i == s.length() && j == p.length()) {
            return true;
        }

        // Base case: if pattern is exhausted but string is not
        if (j == p.length()) {
            return false;
        }

        // Memoization check
        if (dp[i][j] != null) {
            return dp[i][j];
        }

        // Base case: if string is exhausted but pattern is not
        if (i == s.length()) {
            // If remaining pattern is all '*', it can match the empty string
            while (j < p.length() && p.charAt(j) == '*') {
                j++;
            }
            return dp[i][j] = (j == p.length());
        }

        boolean match = false;

        // If current characters match, or pattern has '?', move to next characters
        if (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?') {
            match = isMatchHelper(s, p, i + 1, j + 1, dp);
        }

        // If pattern contains '*', it can match zero or more characters
        if (p.charAt(j) == '*') {
            // Try two possibilities:
            // 1. '*' matches zero characters (move to the next character in pattern)
            // 2. '*' matches one or more characters (move to the next character in string)
            match = isMatchHelper(s, p, i, j + 1, dp) || isMatchHelper(s, p, i + 1, j, dp);
        }

        // Store the result in the memoization table
        dp[i][j] = match;
        return match;
    }
}