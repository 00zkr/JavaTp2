package ex8;

public class MissingElements {

    public static void afficherElementsManquants(int[] t, int n) {
        boolean[] vu = new boolean[n + 1];
        for (int x : t) if (x >= 1 && x <= n) vu[x] = true;
        boolean aucun = true;
        for (int i = 1; i <= n; i++) {
            if (!vu[i]) {
                System.out.print(i + " ");
                aucun = false;
            }
        }
        if (aucun) System.out.print("Aucun élément manquant");
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] tests = {
            {1, 3, 3, 5},
            {1, 2, 3, 4},
            {3, 3, 3},
            {1, 1, 1, 1},
            {4, 2, 2, 1, 5},
            {1},
            {1, 2, 3, 6}
        };
        int[] ns = {5, 4, 3, 4, 5, 1, 4};

        for (int i = 0; i < tests.length; i++) {
            afficherElementsManquants(tests[i], ns[i]);
        }
    }
}
