public class Exercicio01 {
    static void main() {
        //Faça um programa que substitua por 0 todos os elementos da diagonal principal.
        //Regra: fazer sem usar j se perceber que não precisa.

        int[][] mtz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        for (int i = 0; i < mtz.length; i++) {
            for (int j = 0; j < mtz[i].length; j++) {
                System.out.printf("%d ", mtz[i][j]);
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        for (int i = 0; i < mtz.length; i++) {
            mtz[i][i] = 0;
            mtz[i][mtz.length - 1 - i] = 0;
        }

        for (int i = 0; i < mtz.length; i++) {
            for (int j = 0; j < mtz[i].length; j++) {
                System.out.printf("%d ", mtz[i][j]);
            }
            System.out.println();
        }
    }
}
