package ex9;

public class Daigonale {

    public static int differenceDiagonales(int[][] m) {
        int n = m.length;
        int sommePrincipale = 0;
        int sommeSecondaire = 0;
        for (int i = 0; i < n; i++) {
            sommePrincipale += m[i][i];
            sommeSecondaire += m[i][n - 1 - i];
        }
        int absDiff = Math.abs(sommePrincipale - sommeSecondaire);
        System.out.println("Somme diagonale principale : " + sommePrincipale);
        System.out.println("Somme diagonale secondaire : " + sommeSecondaire);
        System.out.println("Différence absolue : " + absDiff);
        return absDiff;
    }

    public static void main(String[] args) {
        int[][][] tests = {
            {{1,2,3},{4,5,6},{7,8,9}},
            {{1,3,5},{2,4,6},{7,8,9}},
            {{5}},
            {{-1,2},{3,-4}}
        };
        for (int[][] m : tests) {
            differenceDiagonales(m);
            System.out.println();
        }
    }
}
