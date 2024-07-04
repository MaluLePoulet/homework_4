package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QA_27_4_0_Zhdanava {
    public static void main(String[] args) {

        int[][][] threeDimensionalArray = new int[3][3][3];

        Random random = new Random();

        for (int i = 0; i < threeDimensionalArray.length; i++) {
            for (int j = 0; j < threeDimensionalArray[i].length; j++) {
                for (int k = 0; k < threeDimensionalArray[i][j].length; k++) {
                    threeDimensionalArray[i][j][k] = random.nextInt(40);
                }
            }
        }
        System.out.println(Arrays.deepToString(threeDimensionalArray));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to increase/decrease each element of the array for: ");
        int numberToIncreaseFor = scanner.nextInt();
        for (int i = 0; i < threeDimensionalArray.length; i++) {
            for (int j = 0; j < threeDimensionalArray[i].length; j++) {
                for (int k = 0; k < threeDimensionalArray[i][j].length; k++) {
                    threeDimensionalArray[i][j][k] += numberToIncreaseFor;
                }
            }
        }
        System.out.println(Arrays.deepToString(threeDimensionalArray));
        scanner.close();
    }
}
