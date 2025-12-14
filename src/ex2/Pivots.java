package ex2;

public class Pivots {

    public static void afficherPivots(int[] t) {
        int n = t.length;
        if (n < 3) {
            System.out.println("Aucun pivot");
            return;
        }

        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];

        prefixMax[0] = t[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], t[i]);
        }

        suffixMin[n - 1] = t[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], t[i]);
        }

        StringBuilder pivots = new StringBuilder();

        for (int i = 1; i <= n - 2; i++) {
            if (prefixMax[i - 1] <= t[i] && suffixMin[i + 1] >= t[i]) {
                pivots.append(t[i]).append(" ");
            }
        }

        if (pivots.length() == 0) {
            System.out.println("Aucun pivot");
        } else {
            System.out.println("Pivots : " + pivots.toString().trim());
        }
    }

    public static void main(String[] args) {

        int[] t1 = {2, 4, 3, 5, 6};
        afficherPivots(t1);

        int[] t2 = {1, 2, 3, 4, 5};
        afficherPivots(t2);

        int[] t3 = {5, 4, 3, 2, 1};
        afficherPivots(t3);

        int[] t4 = {3, 3, 3, 3};
        afficherPivots(t4);

        int[] t5 = {7, 1, 5, 2, 6, 3, 4};
        afficherPivots(t5);
    }
}

