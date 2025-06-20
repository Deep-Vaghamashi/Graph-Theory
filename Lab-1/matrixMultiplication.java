
import java.util.Scanner;

public class matrixMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row size of first matrix:");
        int r1 = sc.nextInt();

        System.out.println("Enter the column size of the first matrix:");
        int c1 = sc.nextInt();

        System.out.println("Enter the row size of second matrix:");
        int r2 = sc.nextInt();

        System.out.println("Enter the column size of the second matrix:");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Multiplication not possible.");
        } else {
            int[][] arr1 = new int[r1][c1];
            int[][] arr2 = new int[r2][c2];
            int[][] ans = new int[r1][c2];

            System.out.println("Enter elements of Matrix 1:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print("Matrix 1 [" + i + "][" + j + "] = ");
                    arr1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter elements of Matrix 2:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print("Matrix 2 [" + i + "][" + j + "] = ");
                    arr2[i][j] = sc.nextInt();
                }
            }

            // Matrix multiplication
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        ans[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            System.out.println("Resultant Matrix:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
