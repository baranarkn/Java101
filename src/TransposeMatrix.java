import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the row number of your two-dimensional matrix: ");
        int row = input.nextInt();
        System.out.print("Please enter the column number of your two-dimensional matrix: ");
        int column = input.nextInt();

        int[][] matrix = new int[row][column];

        System.out.println("Please enter the numbers you want to add to your matrix: ");
        for (int i = 0; i < row; i++){
            for (int j=0; j < matrix[i].length; j++){
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for (int i = 0; i < row; i++){
            for (int j=0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transposeMatrix = new int[column][row];

        for (int i = 0; i < column; i++){
            for (int j = 0; j < row; j++){
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("Transpose Matrix: ");
        for (int i = 0; i < column; i++){
            for (int j=0; j < row; j++){
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
