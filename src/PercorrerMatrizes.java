public class PercorrerMatrizes {
    static void main() {
        // percorrer uma matriz na vertical da esquerda para a direita X
        // percorrer uma matriz na vertical da direita para a esquerda X
        // e mudar os numeros para zero

        int[][] matriz = {
                {2, 2, 6, 3, 2},
                {1, 7, 5, 9, 6},
                {9, 8, 5, 5, 1},
                {7, 3, 9, 3, 2},
                {7, 5, 2, 3, 8}
        };

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
