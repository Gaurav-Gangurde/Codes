import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        int sum = 0;

        System.out.println(" Enter matrix elements :");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Diagonal elements
        for(int i = 0; i < 3; i++) {
            sum = sum + arr[i][i];
        }

        System.out.println("Sum of diagonal elements = " + sum);
    }
}