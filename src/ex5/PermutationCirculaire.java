package ex5;

public class PermutationCirculaire {

    public static boolean estPermutationCirculaire(int[] t) {
        int n = t.length;
        boolean[] vu = new boolean[n + 1];
        for (int x : t) {
            if (x < 1 || x > n || vu[x]) return false;
            vu[x] = true;
        }
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                pos = i;
                break;
            }
        }
        for (int k = 0; k < n; k++) {
            int idx = (pos + k) % n;
            if (t[idx] != k + 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {1},
            {1,2,3,4,5},
            {2,3,4,5,1},
            {3,4,5,1,2},
            {4,5,1,2,3},
            {5,1,2,3,4},
            {3,1,2,4,5},
            {2,1,3,4,5},
            {4,1,2,3,5},
            {0,1,2,3,4},
            {1,2,2,3,4},
            {1,2,3,4,6}
        };

        for (int i = 0; i < tests.length; i++) {
            System.out.println("Test #" + (i+1) + ": " + estPermutationCirculaire(tests[i]));
        }
    }
}
