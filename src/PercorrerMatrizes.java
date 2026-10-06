import java.util.Scanner;

public class PercorrerMatrizes {
    static void main() {
        // percorrer uma matriz na vertical da esquerda para a direita X
        // percorrer uma matriz na vertical da direita para a esquerda X
        // e mudar os numeros para zero

        Scanner teclado = new Scanner(System.in);
        int[][] matriz = {
                {2, 2, 6, 3, 2},
                {1, 7, 5, 9, 6},
                {9, 8, 5, 5, 1},
                {7, 3, 9, 3, 2},
                {7, 5, 2, 3, 8}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("1 - Para, substituir os elementos da esquerda pra direita por 0");
        System.out.println("2 - Para, substituir os elementos da direta pra esquerda por 0");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][i] = 0;
                }
                break;
            case 2:
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][matriz.length - 1 - i] = 0;
                    }
                }
                break;
            default:
                System.out.println("Opção invalida!");
                return;
        }
        System.out.println();
        System.out.println("********************************");
        System.out.println("------ Matriz Atualizada ------");
        System.out.println("********************************");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
