package ex7;

public class MajorityElement {

    public static int elementMajoritaire(int[] t) {
        if (t.length == 0) return -1;
        int candidat = 0, compteur = 0;
        for (int x : t) {
            if (compteur == 0) {
                candidat = x;
                compteur = 1;
            } else {
                compteur += (x == candidat) ? 1 : -1;
            }
        }
        compteur = 0;
        for (int x : t) if (x == candidat) compteur++;
        return (compteur > t.length / 2) ? candidat : -1;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {3, 3, 4, 3, 5},
            {2, 2, 1, 2, 3, 2, 2},
            {1, 1, 1, 1},
            {7},
            {1, 2, 3, 4},
            {1, 2, 2, 3},
            {1, 1, 2, 2},
            {-1, -1, -1, 2, 3},
            {-2, -2, -2, -2, 1, 3},
            {}
        };

        for (int i = 0; i < tests.length; i++) {
            System.out.println("Test #" + (i+1) + ": " + elementMajoritaire(tests[i]));
        }
    }
}
