public class Exercicio01 {
    static void main() {
        int[][] mtz = {
                {2, 4, 6, 8, 10},
                {1, 3, 5, 7, 9},
                {10, 20, 30, 40, 50},
                {5, 10, 15, 20, 25},
                {7, 14, 21, 28, 35}
        };

        for (int i = 0; i < mtz.length; i++) {
            for (int j = 0; j < mtz[i].length; j++) {
                System.out.printf("%d ", mtz[i][j]);
            }
            System.out.println();
        }

        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;
        int intersecao = 0;
        int total = 0;

        System.out.println("-------------------------------");
        for (int i = 0; i < mtz.length; i++) {
            if (i == mtz.length /2) {
                intersecao = mtz[i][i];
            } else {
                diagonalPrincipal += mtz[i][i];
                diagonalSecundaria += mtz[i][mtz.length - 1 - i];
            }
        }
        total = diagonalPrincipal + intersecao + diagonalSecundaria;
        System.out.println(diagonalPrincipal);
        System.out.println(diagonalSecundaria);
        System.out.println(intersecao);

        System.out.printf("Valor final da soma do X é de %d%n", total);

    }
}
