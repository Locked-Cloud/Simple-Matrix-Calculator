import java.util.Scanner;
    public class Main {


        public static int[][] getMatrixFromUser(String message, int rows, int cols, Scanner scanner) {
            System.out.println(message);
            int[][] matrix = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }

            return matrix;
        }
        public static void displayMatrix(String label, int[][] matrix) {
            System.out.println(label);

            for (int[] row : matrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }

            System.out.println();

        }
        public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
            int rows = matrix1.length;
            int cols = matrix1[0].length;
            int[][] sum = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            return sum;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int cols = scanner.nextInt();

            int[][] matrix1 = getMatrixFromUser("Enter elements for the first matrix:", rows, cols, scanner);
                displayMatrix("Matrix 1:", matrix1);
            int[][] matrix2 = getMatrixFromUser("Enter elements for the second matrix:", rows, cols, scanner);
                displayMatrix("Matrix 2:", matrix2);

    }
}