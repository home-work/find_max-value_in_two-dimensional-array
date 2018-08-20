import java.util.Random;
import java.util.Scanner;

public class MaxValueFinding {
    public static void main(String[] args) {
        int[][] array = generateTwoDimensionalArray();
        System.out.println("Mảng Random:");
        displayArray(array);
        System.out.println("Giá trị lớn nhất trong mảng là: " + findMaxValue(array));
    }

    private static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int getNumberOfRowsArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của mảng: ");
        return scanner.nextInt();
    }

    private static int getNumberOfColumnsArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cột của mảng: ");
        return scanner.nextInt();
    }

    private static int[][] generateTwoDimensionalArray() {
        Random random = new Random();
        int[][] array = new int[getNumberOfRowsArray()][getNumberOfColumnsArray()];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100) + 1;
            }
        }
        return array;
    }

    private static int findMaxValue(int[][] array) {
        int maxValue = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxValue < array[i][j]) {
                    maxValue = array[i][j];
                }
            }
        }
        return maxValue;
    }
}
