public class MatrizCubo {
    static void main() {
        String[][] cubo  = {
                {"Verde", "Verde", "Verde"},
                {"Verde", "Verde", "Verde"},
                {"Verde", "Verde", "Verde"}
        };

        for (int i = 0; i < cubo.length; i++){
            for(int j = 0; j < cubo[i].length; j++){
                System.out.printf("%s ", cubo[i][j]);
            }
            System.out.println();
        }
    }
}
