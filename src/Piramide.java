import java.util.Scanner;


public class Piramide {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o tamanho da sua pirâmide:");
        int n = teclado.nextInt();
        String texto = "*";

        for (int i = 0; i < n; i++) {
            System.out.printf("%s%n ", texto, "");
            texto += "**";
        }
    }
}
