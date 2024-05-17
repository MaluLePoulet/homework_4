package lesson4;

import java.util.Arrays;

public class QA_27_4_3_Zhdanava {
    public static void main(String[] args) {

        int[][] twoDimensionalArray = new int[5][5];

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            twoDimensionalArray[i][i] = 1;
        }
        int j = twoDimensionalArray.length - 1;
        for (int i = 0; i < twoDimensionalArray.length; i++, j--) {
            twoDimensionalArray[i][j] = 1;
            System.out.println(Arrays.toString(twoDimensionalArray[i]));
        }
    }
}




