public class MaiorNumeroDeUmaMatriz {
    static void main() {
        int[][] nums = {
                {1, 42, 6},
                {51, 6, 7},
                {3, 0, 9}
        };


        int higher = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] >= higher) {
                    higher = nums[i][j];
                }
            }
        }

        System.out.println("O Maior número dessa Matriz é ");
        System.out.println(higher);
    }
}
