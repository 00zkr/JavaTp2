package ex10;

public class CarreMagique {

    public static boolean estCarreMagique(int[][] m) {
        int ref = m[0][0] + m[0][1] + m[0][2];
        for (int i = 1; i < 3; i++) {
            int sommeLigne = m[i][0] + m[i][1] + m[i][2];
            if (sommeLigne != ref) return false;
        }
        for (int j = 0; j < 3; j++) {
            int sommeColonne = m[0][j] + m[1][j] + m[2][j];
            if (sommeColonne != ref) return false;
        }
        int diag1 = m[0][0] + m[1][1] + m[2][2];
        int diag2 = m[0][2] + m[1][1] + m[2][0];
        return diag1 == ref && diag2 == ref;
    }

    public static void main(String[] args) {
        int[][][] tests = {
            {{8,1,6},{3,5,7},{4,9,2}},
            {{2,7,6},{9,5,1},{4,3,7}},
            {{1,1,1},{1,1,1},{1,1,1}},
            {{-2,0,2},{1,0,-1},{0,0,0}},
            {{4,9,2},{3,5,7},{8,1,6}}
        };
        for (int[][] m : tests) {
            if (estCarreMagique(m)) {
                System.out.println("Carré magique");
            } else {
                System.out.println("Pas un carré magique");
            }
        }
    }
}
