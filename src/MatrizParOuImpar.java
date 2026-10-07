public class MatrizParOuImpar {
    static void main() {

        int[][] mtz = {
                {2, 5, 8},
                {7, 4, 3},
                {9, 6, 1}
        };

        for (int i = 0; i < mtz.length; i++) {

            if (i == mtz.length / 2) {
                if (mtz[i][i] % 2 == 0) {
                    mtz[i][i] = 0;
                } else {
                    mtz[i][i] = 1;
                }
            }else {
                if (mtz[i][i] % 2 == 0) {
                    mtz[i][i] = 0;
                } else {
                    mtz[i][i] = 1;
                }

                if (mtz[i][mtz.length - 1 - i] % 2 == 0) {
                    mtz[i][mtz.length - 1 - i] = 0;
                } else {
                    mtz[i][mtz.length - 1 - i] = 1;
                }
            }
        }

        for (int i = 0; i < mtz.length; i++) {
            for (int j = 0; j < mtz[i].length; j++) {
                System.out.printf("%d ", mtz[i][j]);
            }
            System.out.println();
        }

    }
}
