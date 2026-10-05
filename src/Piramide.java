import java.util.Scanner;

public class Piramide {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o tamanho da sua pirâmide:");
        int n = teclado.nextInt();
        StringBuilder texto = new StringBuilder();
        texto = new StringBuilder();

        for (int i = 0; i < n; i++) {
            texto.append("*" );
            System.out.println(" " + texto + " ");
        }
    }
}
