package lesson4;

import java.util.Arrays;

public class QA_27_4_1_Zhdanava {
    public static void main(String[] args) {
        char[][] twoDimensionalArray = new char[8][8];

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    twoDimensionalArray[i][j] = 'W';
                } else
                    twoDimensionalArray[i][j] = 'B';
            }
            System.out.println(Arrays.toString(twoDimensionalArray[i]));
        }
    }
}