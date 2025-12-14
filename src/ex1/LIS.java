package ex1;

public class LIS {

    public static int longueurLIS(int[] t) {
        if (t == null || t.length == 0) return 0;

        int n = t.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) dp[i] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (t[j] < t[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int res = 0;
        for (int v : dp) res = Math.max(res, v);
        return res;
    }
}
