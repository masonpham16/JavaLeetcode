class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
        }
}



/*
Example Walkthrough for n=5
    Initialize dp[]
            dp=[0,1,2,0,0,0]
            
    Calculate dp[3]
        dp[3]=dp[2]+dp[1]=2+1=3
            dp=[0,1,2,3,0,0]
            
    Calculate dp[4]
        dp[4]=dp[3]+dp[2]=3+2=5
            dp=[0,1,2,3,5,0]
            
    Calculate dp[5]
        dp[5]=dp[4]+dp[3]=5+3=8
            dp=[0,1,2,3,5,8]
            
Finally, return dp[5]=8
*/
