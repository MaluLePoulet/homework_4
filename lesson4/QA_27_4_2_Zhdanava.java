package lesson4;

import java.util.Arrays;
import java.util.Random;

public class QA_27_4_2_Zhdanava {
    public static void main(String[] args) {

        int[][] twoDimensionalArray = new int[5][];

        for (int i = 0; i < 5; i++) {
            twoDimensionalArray[i] = new int[twoDimensionalArray.length - i];
        }
        Random random = new Random();
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                twoDimensionalArray[i][j] = random.nextInt(40);
            }
            System.out.println(Arrays.toString(twoDimensionalArray[i]));
        }
        int sum = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                sum += twoDimensionalArray[i][j];
            }
        }
        System.out.println("Sum of the array: " + sum);
    }
}

