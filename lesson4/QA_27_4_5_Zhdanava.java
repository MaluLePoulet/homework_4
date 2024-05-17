package lesson4;

public class QA_27_4_5_Zhdanava {
    public static void main(String[] args) {

        int[][] firstMatrix = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] secondMatrix = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                int result = 0;
                for (int k = 0; k < secondMatrix.length; k++) {
                    result += firstMatrix[i][k] * secondMatrix[k][j];
                }
                System.out.print(result + " ");
            }
        }
    }
}
