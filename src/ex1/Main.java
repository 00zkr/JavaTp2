package ex1;
import static ex1.LIS.longueurLIS; 

public class Main {
	public static void main(String[] args) {
        int[][] tests = {
            {},
            {5},
            {5, 4, 3, 2, 1},
            {1, 2, 3, 4, 5},
            {2, 1, 4, 2, 3, 5, 1, 7},
            {3, 3, 3, 3},
            {10, 9, 2, 5, 3, 7, 101, 18}
        };

        for (int[] t : tests) {
            System.out.println("LIS = " + longueurLIS(t));
        }
    }
}
