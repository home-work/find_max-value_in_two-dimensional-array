public class MaxValueFinding {
    public static void main(String[] args) {
        int[][] array = generateTwoDimensionalArray();
        System.out.println("Giá trị lớn nhất trong mảng là: " + findMaxValue(array));
    }

    private static int[][] generateTwoDimensionalArray() {
        int[][] array = {{12,14},{1,1}};
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
