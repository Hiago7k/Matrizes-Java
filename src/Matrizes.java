import java.util.Scanner;

public class Matrizes {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Digite o valor: ");
                int valor = teclado.nextInt();
                matriz[i][j] = valor;
            }
        }

        System.out.println();
        System.out.println("------");

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
