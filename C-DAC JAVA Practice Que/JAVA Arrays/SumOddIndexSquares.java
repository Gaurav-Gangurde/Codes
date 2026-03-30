import java.util.Scanner;

public class SumOddIndexSquares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        // odd index means 1,3,5,...
        for(int i = 1; i < n; i = i + 2) {
            sum = sum + (arr[i] * arr[i]);
        }
        

        System.out.println("Sum of squares of odd index values = " + sum);
    }
}