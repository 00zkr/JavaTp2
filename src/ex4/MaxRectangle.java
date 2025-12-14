package ex4;

public class MaxRectangle {

    static class Rectangle {
        int top, left, bottom, right, area;
    }

    public static Rectangle trouverMaxRectangle(int[][] m) {
        if (m == null || m.length == 0 || m[0].length == 0) return null;

        int R = m.length, C = m[0].length;
        int[] h = new int[C];
        Rectangle best = new Rectangle();

        for (int i = 0; i < R; i++) {
            // build histogram for row i
            for (int j = 0; j < C; j++) {
                h[j] = (m[i][j] == 0) ? 0 : h[j] + 1;
            }

            // largest rectangle in histogram h
            java.util.Stack<Integer> st = new java.util.Stack<>();
            for (int j = 0; j <= C; j++) {
                int cur = (j == C) ? 0 : h[j];

                while (!st.isEmpty() && cur < h[st.peek()]) {
                    int height = h[st.pop()];
                    int right = j - 1;
                    int left = st.isEmpty() ? 0 : st.peek() + 1;
                    int area = height * (right - left + 1);

                    if (area > best.area) {
                        best.area = area;
                        best.top = i - height + 1;
                        best.bottom = i;
                        best.left = left;
                        best.right = right;
                    }
                }
                st.push(j);
            }
        }
        return best;
    }

    public static void main(String[] args) {
        int[][][] tests = {
            {
                {0,1,1,0,1},
                {1,1,1,1,0},
                {1,1,1,1,0},
                {1,1,0,0,1}
            },
            {
                {0,0,0},
                {0,0,0},
                {0,0,0}
            },
            {
                {1,1,1},
                {1,1,1},
                {1,1,1}
            },
            {{0}},
            {{1}},
            {
                {0,0,0,0},
                {0,1,1,0},
                {0,1,1,0},
                {0,0,0,0}
            },
            {
                {1,1,0,1},
                {1,1,0,1},
                {0,0,1,1}
            }
        };

        for (int t = 0; t < tests.length; t++) {
            System.out.println("Test #" + (t+1));
            Rectangle r = trouverMaxRectangle(tests[t]);
            if (r != null) {
                System.out.println("Aire: " + r.area);
                System.out.println("top=" + r.top + " left=" + r.left +
                                   " bottom=" + r.bottom + " right=" + r.right);
            } else {
                System.out.println("Matrice vide");
            }
            System.out.println();
        }
    }
}
